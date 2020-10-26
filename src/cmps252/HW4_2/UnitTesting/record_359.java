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

@Tag("3")
class Record_359 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 359: FirstName is Lynette")
	void FirstNameOfRecord359() {
		assertEquals("Lynette", customers.get(358).getFirstName());
	}

	@Test
	@DisplayName("Record 359: LastName is Vora")
	void LastNameOfRecord359() {
		assertEquals("Vora", customers.get(358).getLastName());
	}

	@Test
	@DisplayName("Record 359: Company is Manns Welding & Trlr Hitch Inc")
	void CompanyOfRecord359() {
		assertEquals("Manns Welding & Trlr Hitch Inc", customers.get(358).getCompany());
	}

	@Test
	@DisplayName("Record 359: Address is 4642 S 35th St")
	void AddressOfRecord359() {
		assertEquals("4642 S 35th St", customers.get(358).getAddress());
	}

	@Test
	@DisplayName("Record 359: City is Phoenix")
	void CityOfRecord359() {
		assertEquals("Phoenix", customers.get(358).getCity());
	}

	@Test
	@DisplayName("Record 359: County is Maricopa")
	void CountyOfRecord359() {
		assertEquals("Maricopa", customers.get(358).getCounty());
	}

	@Test
	@DisplayName("Record 359: State is AZ")
	void StateOfRecord359() {
		assertEquals("AZ", customers.get(358).getState());
	}

	@Test
	@DisplayName("Record 359: ZIP is 85040")
	void ZIPOfRecord359() {
		assertEquals("85040", customers.get(358).getZIP());
	}

	@Test
	@DisplayName("Record 359: Phone is 602-268-4426")
	void PhoneOfRecord359() {
		assertEquals("602-268-4426", customers.get(358).getPhone());
	}

	@Test
	@DisplayName("Record 359: Fax is 602-268-0658")
	void FaxOfRecord359() {
		assertEquals("602-268-0658", customers.get(358).getFax());
	}

	@Test
	@DisplayName("Record 359: Email is lynette@vora.com")
	void EmailOfRecord359() {
		assertEquals("lynette@vora.com", customers.get(358).getEmail());
	}

	@Test
	@DisplayName("Record 359: Web is http://www.lynettevora.com")
	void WebOfRecord359() {
		assertEquals("http://www.lynettevora.com", customers.get(358).getWeb());
	}
}
