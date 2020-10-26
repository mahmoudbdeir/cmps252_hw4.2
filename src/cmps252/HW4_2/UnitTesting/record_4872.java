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

@Tag("30")
class Record_4872 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4872: FirstName is Owen")
	void FirstNameOfRecord4872() {
		assertEquals("Owen", customers.get(4871).getFirstName());
	}

	@Test
	@DisplayName("Record 4872: LastName is Hinkston")
	void LastNameOfRecord4872() {
		assertEquals("Hinkston", customers.get(4871).getLastName());
	}

	@Test
	@DisplayName("Record 4872: Company is Empire Blue Cross Blue Shield")
	void CompanyOfRecord4872() {
		assertEquals("Empire Blue Cross Blue Shield", customers.get(4871).getCompany());
	}

	@Test
	@DisplayName("Record 4872: Address is 109 N San Saba")
	void AddressOfRecord4872() {
		assertEquals("109 N San Saba", customers.get(4871).getAddress());
	}

	@Test
	@DisplayName("Record 4872: City is San Antonio")
	void CityOfRecord4872() {
		assertEquals("San Antonio", customers.get(4871).getCity());
	}

	@Test
	@DisplayName("Record 4872: County is Bexar")
	void CountyOfRecord4872() {
		assertEquals("Bexar", customers.get(4871).getCounty());
	}

	@Test
	@DisplayName("Record 4872: State is TX")
	void StateOfRecord4872() {
		assertEquals("TX", customers.get(4871).getState());
	}

	@Test
	@DisplayName("Record 4872: ZIP is 78207")
	void ZIPOfRecord4872() {
		assertEquals("78207", customers.get(4871).getZIP());
	}

	@Test
	@DisplayName("Record 4872: Phone is 210-226-9609")
	void PhoneOfRecord4872() {
		assertEquals("210-226-9609", customers.get(4871).getPhone());
	}

	@Test
	@DisplayName("Record 4872: Fax is 210-226-0366")
	void FaxOfRecord4872() {
		assertEquals("210-226-0366", customers.get(4871).getFax());
	}

	@Test
	@DisplayName("Record 4872: Email is owen@hinkston.com")
	void EmailOfRecord4872() {
		assertEquals("owen@hinkston.com", customers.get(4871).getEmail());
	}

	@Test
	@DisplayName("Record 4872: Web is http://www.owenhinkston.com")
	void WebOfRecord4872() {
		assertEquals("http://www.owenhinkston.com", customers.get(4871).getWeb());
	}
}
