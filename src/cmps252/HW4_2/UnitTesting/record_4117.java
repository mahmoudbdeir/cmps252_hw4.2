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
class Record_4117 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4117: FirstName is Rhoda")
	void FirstNameOfRecord4117() {
		assertEquals("Rhoda", customers.get(4116).getFirstName());
	}

	@Test
	@DisplayName("Record 4117: LastName is Police")
	void LastNameOfRecord4117() {
		assertEquals("Police", customers.get(4116).getLastName());
	}

	@Test
	@DisplayName("Record 4117: Company is Management Science Assocs Inc")
	void CompanyOfRecord4117() {
		assertEquals("Management Science Assocs Inc", customers.get(4116).getCompany());
	}

	@Test
	@DisplayName("Record 4117: Address is 3055 Northwest Blvd")
	void AddressOfRecord4117() {
		assertEquals("3055 Northwest Blvd", customers.get(4116).getAddress());
	}

	@Test
	@DisplayName("Record 4117: City is Gastonia")
	void CityOfRecord4117() {
		assertEquals("Gastonia", customers.get(4116).getCity());
	}

	@Test
	@DisplayName("Record 4117: County is Gaston")
	void CountyOfRecord4117() {
		assertEquals("Gaston", customers.get(4116).getCounty());
	}

	@Test
	@DisplayName("Record 4117: State is NC")
	void StateOfRecord4117() {
		assertEquals("NC", customers.get(4116).getState());
	}

	@Test
	@DisplayName("Record 4117: ZIP is 28052")
	void ZIPOfRecord4117() {
		assertEquals("28052", customers.get(4116).getZIP());
	}

	@Test
	@DisplayName("Record 4117: Phone is 704-866-5669")
	void PhoneOfRecord4117() {
		assertEquals("704-866-5669", customers.get(4116).getPhone());
	}

	@Test
	@DisplayName("Record 4117: Fax is 704-866-7687")
	void FaxOfRecord4117() {
		assertEquals("704-866-7687", customers.get(4116).getFax());
	}

	@Test
	@DisplayName("Record 4117: Email is rhoda@police.com")
	void EmailOfRecord4117() {
		assertEquals("rhoda@police.com", customers.get(4116).getEmail());
	}

	@Test
	@DisplayName("Record 4117: Web is http://www.rhodapolice.com")
	void WebOfRecord4117() {
		assertEquals("http://www.rhodapolice.com", customers.get(4116).getWeb());
	}
}
