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

@Tag("46")
class Record_3822 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3822: FirstName is Davis")
	void FirstNameOfRecord3822() {
		assertEquals("Davis", customers.get(3821).getFirstName());
	}

	@Test
	@DisplayName("Record 3822: LastName is Garrard")
	void LastNameOfRecord3822() {
		assertEquals("Garrard", customers.get(3821).getLastName());
	}

	@Test
	@DisplayName("Record 3822: Company is Romero, Marie Esq")
	void CompanyOfRecord3822() {
		assertEquals("Romero, Marie Esq", customers.get(3821).getCompany());
	}

	@Test
	@DisplayName("Record 3822: Address is 4970 31st St")
	void AddressOfRecord3822() {
		assertEquals("4970 31st St", customers.get(3821).getAddress());
	}

	@Test
	@DisplayName("Record 3822: City is Long Island City")
	void CityOfRecord3822() {
		assertEquals("Long Island City", customers.get(3821).getCity());
	}

	@Test
	@DisplayName("Record 3822: County is Queens")
	void CountyOfRecord3822() {
		assertEquals("Queens", customers.get(3821).getCounty());
	}

	@Test
	@DisplayName("Record 3822: State is NY")
	void StateOfRecord3822() {
		assertEquals("NY", customers.get(3821).getState());
	}

	@Test
	@DisplayName("Record 3822: ZIP is 11101")
	void ZIPOfRecord3822() {
		assertEquals("11101", customers.get(3821).getZIP());
	}

	@Test
	@DisplayName("Record 3822: Phone is 718-392-5703")
	void PhoneOfRecord3822() {
		assertEquals("718-392-5703", customers.get(3821).getPhone());
	}

	@Test
	@DisplayName("Record 3822: Fax is 718-392-4628")
	void FaxOfRecord3822() {
		assertEquals("718-392-4628", customers.get(3821).getFax());
	}

	@Test
	@DisplayName("Record 3822: Email is davis@garrard.com")
	void EmailOfRecord3822() {
		assertEquals("davis@garrard.com", customers.get(3821).getEmail());
	}

	@Test
	@DisplayName("Record 3822: Web is http://www.davisgarrard.com")
	void WebOfRecord3822() {
		assertEquals("http://www.davisgarrard.com", customers.get(3821).getWeb());
	}
}
