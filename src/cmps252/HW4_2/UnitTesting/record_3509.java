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

@Tag("17")
class Record_3509 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3509: FirstName is Hong")
	void FirstNameOfRecord3509() {
		assertEquals("Hong", customers.get(3508).getFirstName());
	}

	@Test
	@DisplayName("Record 3509: LastName is Helvey")
	void LastNameOfRecord3509() {
		assertEquals("Helvey", customers.get(3508).getLastName());
	}

	@Test
	@DisplayName("Record 3509: Company is Packaging Corporation Of Amer")
	void CompanyOfRecord3509() {
		assertEquals("Packaging Corporation Of Amer", customers.get(3508).getCompany());
	}

	@Test
	@DisplayName("Record 3509: Address is 235 W 1st St")
	void AddressOfRecord3509() {
		assertEquals("235 W 1st St", customers.get(3508).getAddress());
	}

	@Test
	@DisplayName("Record 3509: City is Bayonne")
	void CityOfRecord3509() {
		assertEquals("Bayonne", customers.get(3508).getCity());
	}

	@Test
	@DisplayName("Record 3509: County is Hudson")
	void CountyOfRecord3509() {
		assertEquals("Hudson", customers.get(3508).getCounty());
	}

	@Test
	@DisplayName("Record 3509: State is NJ")
	void StateOfRecord3509() {
		assertEquals("NJ", customers.get(3508).getState());
	}

	@Test
	@DisplayName("Record 3509: ZIP is 7002")
	void ZIPOfRecord3509() {
		assertEquals("7002", customers.get(3508).getZIP());
	}

	@Test
	@DisplayName("Record 3509: Phone is 201-823-7658")
	void PhoneOfRecord3509() {
		assertEquals("201-823-7658", customers.get(3508).getPhone());
	}

	@Test
	@DisplayName("Record 3509: Fax is 201-823-0459")
	void FaxOfRecord3509() {
		assertEquals("201-823-0459", customers.get(3508).getFax());
	}

	@Test
	@DisplayName("Record 3509: Email is hong@helvey.com")
	void EmailOfRecord3509() {
		assertEquals("hong@helvey.com", customers.get(3508).getEmail());
	}

	@Test
	@DisplayName("Record 3509: Web is http://www.honghelvey.com")
	void WebOfRecord3509() {
		assertEquals("http://www.honghelvey.com", customers.get(3508).getWeb());
	}
}
