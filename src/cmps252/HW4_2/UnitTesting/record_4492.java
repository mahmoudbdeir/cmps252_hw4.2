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

@Tag("0")
class Record_4492 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4492: FirstName is Alma")
	void FirstNameOfRecord4492() {
		assertEquals("Alma", customers.get(4491).getFirstName());
	}

	@Test
	@DisplayName("Record 4492: LastName is Volek")
	void LastNameOfRecord4492() {
		assertEquals("Volek", customers.get(4491).getLastName());
	}

	@Test
	@DisplayName("Record 4492: Company is Hampton Inn")
	void CompanyOfRecord4492() {
		assertEquals("Hampton Inn", customers.get(4491).getCompany());
	}

	@Test
	@DisplayName("Record 4492: Address is 320 W Cedar Ave")
	void AddressOfRecord4492() {
		assertEquals("320 W Cedar Ave", customers.get(4491).getAddress());
	}

	@Test
	@DisplayName("Record 4492: City is Gladwin")
	void CityOfRecord4492() {
		assertEquals("Gladwin", customers.get(4491).getCity());
	}

	@Test
	@DisplayName("Record 4492: County is Gladwin")
	void CountyOfRecord4492() {
		assertEquals("Gladwin", customers.get(4491).getCounty());
	}

	@Test
	@DisplayName("Record 4492: State is MI")
	void StateOfRecord4492() {
		assertEquals("MI", customers.get(4491).getState());
	}

	@Test
	@DisplayName("Record 4492: ZIP is 48624")
	void ZIPOfRecord4492() {
		assertEquals("48624", customers.get(4491).getZIP());
	}

	@Test
	@DisplayName("Record 4492: Phone is 989-426-1765")
	void PhoneOfRecord4492() {
		assertEquals("989-426-1765", customers.get(4491).getPhone());
	}

	@Test
	@DisplayName("Record 4492: Fax is 989-426-6717")
	void FaxOfRecord4492() {
		assertEquals("989-426-6717", customers.get(4491).getFax());
	}

	@Test
	@DisplayName("Record 4492: Email is alma@volek.com")
	void EmailOfRecord4492() {
		assertEquals("alma@volek.com", customers.get(4491).getEmail());
	}

	@Test
	@DisplayName("Record 4492: Web is http://www.almavolek.com")
	void WebOfRecord4492() {
		assertEquals("http://www.almavolek.com", customers.get(4491).getWeb());
	}
}
