package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("35")
class Record_3631 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3631: FirstName is Young")
	void FirstNameOfRecord3631() {
		assertEquals("Young", customers.get(3630).getFirstName());
	}

	@Test
	@DisplayName("Record 3631: LastName is Pridemore")
	void LastNameOfRecord3631() {
		assertEquals("Pridemore", customers.get(3630).getLastName());
	}

	@Test
	@DisplayName("Record 3631: Company is S & S Soap Company Inc")
	void CompanyOfRecord3631() {
		assertEquals("S & S Soap Company Inc", customers.get(3630).getCompany());
	}

	@Test
	@DisplayName("Record 3631: Address is 1393 S Woodward Ave")
	void AddressOfRecord3631() {
		assertEquals("1393 S Woodward Ave", customers.get(3630).getAddress());
	}

	@Test
	@DisplayName("Record 3631: City is Bloomfield Hills")
	void CityOfRecord3631() {
		assertEquals("Bloomfield Hills", customers.get(3630).getCity());
	}

	@Test
	@DisplayName("Record 3631: County is Oakland")
	void CountyOfRecord3631() {
		assertEquals("Oakland", customers.get(3630).getCounty());
	}

	@Test
	@DisplayName("Record 3631: State is MI")
	void StateOfRecord3631() {
		assertEquals("MI", customers.get(3630).getState());
	}

	@Test
	@DisplayName("Record 3631: ZIP is 48302")
	void ZIPOfRecord3631() {
		assertEquals("48302", customers.get(3630).getZIP());
	}

	@Test
	@DisplayName("Record 3631: Phone is 248-644-9886")
	void PhoneOfRecord3631() {
		assertEquals("248-644-9886", customers.get(3630).getPhone());
	}

	@Test
	@DisplayName("Record 3631: Fax is 248-644-2285")
	void FaxOfRecord3631() {
		assertEquals("248-644-2285", customers.get(3630).getFax());
	}

	@Test
	@DisplayName("Record 3631: Email is young@pridemore.com")
	void EmailOfRecord3631() {
		assertEquals("young@pridemore.com", customers.get(3630).getEmail());
	}

	@Test
	@DisplayName("Record 3631: Web is http://www.youngpridemore.com")
	void WebOfRecord3631() {
		assertEquals("http://www.youngpridemore.com", customers.get(3630).getWeb());
	}
}
