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

@Tag("24")
class Record_3421 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3421: FirstName is Miles")
	void FirstNameOfRecord3421() {
		assertEquals("Miles", customers.get(3420).getFirstName());
	}

	@Test
	@DisplayName("Record 3421: LastName is Ellens")
	void LastNameOfRecord3421() {
		assertEquals("Ellens", customers.get(3420).getLastName());
	}

	@Test
	@DisplayName("Record 3421: Company is Kwikprint Inc")
	void CompanyOfRecord3421() {
		assertEquals("Kwikprint Inc", customers.get(3420).getCompany());
	}

	@Test
	@DisplayName("Record 3421: Address is 619 Parkway")
	void AddressOfRecord3421() {
		assertEquals("619 Parkway", customers.get(3420).getAddress());
	}

	@Test
	@DisplayName("Record 3421: City is Richland")
	void CityOfRecord3421() {
		assertEquals("Richland", customers.get(3420).getCity());
	}

	@Test
	@DisplayName("Record 3421: County is Benton")
	void CountyOfRecord3421() {
		assertEquals("Benton", customers.get(3420).getCounty());
	}

	@Test
	@DisplayName("Record 3421: State is WA")
	void StateOfRecord3421() {
		assertEquals("WA", customers.get(3420).getState());
	}

	@Test
	@DisplayName("Record 3421: ZIP is 99352")
	void ZIPOfRecord3421() {
		assertEquals("99352", customers.get(3420).getZIP());
	}

	@Test
	@DisplayName("Record 3421: Phone is 509-943-6940")
	void PhoneOfRecord3421() {
		assertEquals("509-943-6940", customers.get(3420).getPhone());
	}

	@Test
	@DisplayName("Record 3421: Fax is 509-943-3952")
	void FaxOfRecord3421() {
		assertEquals("509-943-3952", customers.get(3420).getFax());
	}

	@Test
	@DisplayName("Record 3421: Email is miles@ellens.com")
	void EmailOfRecord3421() {
		assertEquals("miles@ellens.com", customers.get(3420).getEmail());
	}

	@Test
	@DisplayName("Record 3421: Web is http://www.milesellens.com")
	void WebOfRecord3421() {
		assertEquals("http://www.milesellens.com", customers.get(3420).getWeb());
	}
}
