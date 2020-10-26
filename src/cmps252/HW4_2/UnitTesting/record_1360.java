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

@Tag("39")
class Record_1360 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1360: FirstName is Kristine")
	void FirstNameOfRecord1360() {
		assertEquals("Kristine", customers.get(1359).getFirstName());
	}

	@Test
	@DisplayName("Record 1360: LastName is Babick")
	void LastNameOfRecord1360() {
		assertEquals("Babick", customers.get(1359).getLastName());
	}

	@Test
	@DisplayName("Record 1360: Company is Norman Bragar Co Inc")
	void CompanyOfRecord1360() {
		assertEquals("Norman Bragar Co Inc", customers.get(1359).getCompany());
	}

	@Test
	@DisplayName("Record 1360: Address is Box #-27105")
	void AddressOfRecord1360() {
		assertEquals("Box #-27105", customers.get(1359).getAddress());
	}

	@Test
	@DisplayName("Record 1360: City is Oklahoma City")
	void CityOfRecord1360() {
		assertEquals("Oklahoma City", customers.get(1359).getCity());
	}

	@Test
	@DisplayName("Record 1360: County is Oklahoma")
	void CountyOfRecord1360() {
		assertEquals("Oklahoma", customers.get(1359).getCounty());
	}

	@Test
	@DisplayName("Record 1360: State is OK")
	void StateOfRecord1360() {
		assertEquals("OK", customers.get(1359).getState());
	}

	@Test
	@DisplayName("Record 1360: ZIP is 73137")
	void ZIPOfRecord1360() {
		assertEquals("73137", customers.get(1359).getZIP());
	}

	@Test
	@DisplayName("Record 1360: Phone is 405-682-9799")
	void PhoneOfRecord1360() {
		assertEquals("405-682-9799", customers.get(1359).getPhone());
	}

	@Test
	@DisplayName("Record 1360: Fax is 405-682-5682")
	void FaxOfRecord1360() {
		assertEquals("405-682-5682", customers.get(1359).getFax());
	}

	@Test
	@DisplayName("Record 1360: Email is kristine@babick.com")
	void EmailOfRecord1360() {
		assertEquals("kristine@babick.com", customers.get(1359).getEmail());
	}

	@Test
	@DisplayName("Record 1360: Web is http://www.kristinebabick.com")
	void WebOfRecord1360() {
		assertEquals("http://www.kristinebabick.com", customers.get(1359).getWeb());
	}
}
