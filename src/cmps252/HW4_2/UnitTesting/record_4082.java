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

@Tag("49")
class Record_4082 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4082: FirstName is Jonas")
	void FirstNameOfRecord4082() {
		assertEquals("Jonas", customers.get(4081).getFirstName());
	}

	@Test
	@DisplayName("Record 4082: LastName is Mcnail")
	void LastNameOfRecord4082() {
		assertEquals("Mcnail", customers.get(4081).getLastName());
	}

	@Test
	@DisplayName("Record 4082: Company is Washington Beef Co Of N Y Inc")
	void CompanyOfRecord4082() {
		assertEquals("Washington Beef Co Of N Y Inc", customers.get(4081).getCompany());
	}

	@Test
	@DisplayName("Record 4082: Address is 2922 N 18th Pl")
	void AddressOfRecord4082() {
		assertEquals("2922 N 18th Pl", customers.get(4081).getAddress());
	}

	@Test
	@DisplayName("Record 4082: City is Phoenix")
	void CityOfRecord4082() {
		assertEquals("Phoenix", customers.get(4081).getCity());
	}

	@Test
	@DisplayName("Record 4082: County is Maricopa")
	void CountyOfRecord4082() {
		assertEquals("Maricopa", customers.get(4081).getCounty());
	}

	@Test
	@DisplayName("Record 4082: State is AZ")
	void StateOfRecord4082() {
		assertEquals("AZ", customers.get(4081).getState());
	}

	@Test
	@DisplayName("Record 4082: ZIP is 85016")
	void ZIPOfRecord4082() {
		assertEquals("85016", customers.get(4081).getZIP());
	}

	@Test
	@DisplayName("Record 4082: Phone is 602-264-6108")
	void PhoneOfRecord4082() {
		assertEquals("602-264-6108", customers.get(4081).getPhone());
	}

	@Test
	@DisplayName("Record 4082: Fax is 602-264-2684")
	void FaxOfRecord4082() {
		assertEquals("602-264-2684", customers.get(4081).getFax());
	}

	@Test
	@DisplayName("Record 4082: Email is jonas@mcnail.com")
	void EmailOfRecord4082() {
		assertEquals("jonas@mcnail.com", customers.get(4081).getEmail());
	}

	@Test
	@DisplayName("Record 4082: Web is http://www.jonasmcnail.com")
	void WebOfRecord4082() {
		assertEquals("http://www.jonasmcnail.com", customers.get(4081).getWeb());
	}
}
