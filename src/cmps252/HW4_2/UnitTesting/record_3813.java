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

@Tag("21")
class Record_3813 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3813: FirstName is Bess")
	void FirstNameOfRecord3813() {
		assertEquals("Bess", customers.get(3812).getFirstName());
	}

	@Test
	@DisplayName("Record 3813: LastName is Schleker")
	void LastNameOfRecord3813() {
		assertEquals("Schleker", customers.get(3812).getLastName());
	}

	@Test
	@DisplayName("Record 3813: Company is Montgomery Elevator Company")
	void CompanyOfRecord3813() {
		assertEquals("Montgomery Elevator Company", customers.get(3812).getCompany());
	}

	@Test
	@DisplayName("Record 3813: Address is 251 N Delsea Dr")
	void AddressOfRecord3813() {
		assertEquals("251 N Delsea Dr", customers.get(3812).getAddress());
	}

	@Test
	@DisplayName("Record 3813: City is Deptford")
	void CityOfRecord3813() {
		assertEquals("Deptford", customers.get(3812).getCity());
	}

	@Test
	@DisplayName("Record 3813: County is Gloucester")
	void CountyOfRecord3813() {
		assertEquals("Gloucester", customers.get(3812).getCounty());
	}

	@Test
	@DisplayName("Record 3813: State is NJ")
	void StateOfRecord3813() {
		assertEquals("NJ", customers.get(3812).getState());
	}

	@Test
	@DisplayName("Record 3813: ZIP is 8096")
	void ZIPOfRecord3813() {
		assertEquals("8096", customers.get(3812).getZIP());
	}

	@Test
	@DisplayName("Record 3813: Phone is 856-384-7750")
	void PhoneOfRecord3813() {
		assertEquals("856-384-7750", customers.get(3812).getPhone());
	}

	@Test
	@DisplayName("Record 3813: Fax is 856-384-7976")
	void FaxOfRecord3813() {
		assertEquals("856-384-7976", customers.get(3812).getFax());
	}

	@Test
	@DisplayName("Record 3813: Email is bess@schleker.com")
	void EmailOfRecord3813() {
		assertEquals("bess@schleker.com", customers.get(3812).getEmail());
	}

	@Test
	@DisplayName("Record 3813: Web is http://www.bessschleker.com")
	void WebOfRecord3813() {
		assertEquals("http://www.bessschleker.com", customers.get(3812).getWeb());
	}
}
