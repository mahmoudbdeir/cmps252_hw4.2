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

@Tag("36")
class Record_1759 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1759: FirstName is Sheena")
	void FirstNameOfRecord1759() {
		assertEquals("Sheena", customers.get(1758).getFirstName());
	}

	@Test
	@DisplayName("Record 1759: LastName is Laker")
	void LastNameOfRecord1759() {
		assertEquals("Laker", customers.get(1758).getLastName());
	}

	@Test
	@DisplayName("Record 1759: Company is Jack Opler Sales Company Inc")
	void CompanyOfRecord1759() {
		assertEquals("Jack Opler Sales Company Inc", customers.get(1758).getCompany());
	}

	@Test
	@DisplayName("Record 1759: Address is 2498 Superior Ave E")
	void AddressOfRecord1759() {
		assertEquals("2498 Superior Ave E", customers.get(1758).getAddress());
	}

	@Test
	@DisplayName("Record 1759: City is Cleveland")
	void CityOfRecord1759() {
		assertEquals("Cleveland", customers.get(1758).getCity());
	}

	@Test
	@DisplayName("Record 1759: County is Cuyahoga")
	void CountyOfRecord1759() {
		assertEquals("Cuyahoga", customers.get(1758).getCounty());
	}

	@Test
	@DisplayName("Record 1759: State is OH")
	void StateOfRecord1759() {
		assertEquals("OH", customers.get(1758).getState());
	}

	@Test
	@DisplayName("Record 1759: ZIP is 44114")
	void ZIPOfRecord1759() {
		assertEquals("44114", customers.get(1758).getZIP());
	}

	@Test
	@DisplayName("Record 1759: Phone is 216-861-2421")
	void PhoneOfRecord1759() {
		assertEquals("216-861-2421", customers.get(1758).getPhone());
	}

	@Test
	@DisplayName("Record 1759: Fax is 216-861-1826")
	void FaxOfRecord1759() {
		assertEquals("216-861-1826", customers.get(1758).getFax());
	}

	@Test
	@DisplayName("Record 1759: Email is sheena@laker.com")
	void EmailOfRecord1759() {
		assertEquals("sheena@laker.com", customers.get(1758).getEmail());
	}

	@Test
	@DisplayName("Record 1759: Web is http://www.sheenalaker.com")
	void WebOfRecord1759() {
		assertEquals("http://www.sheenalaker.com", customers.get(1758).getWeb());
	}
}
