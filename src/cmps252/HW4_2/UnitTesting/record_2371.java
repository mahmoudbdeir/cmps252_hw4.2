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

@Tag("26")
class Record_2371 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2371: FirstName is Quinton")
	void FirstNameOfRecord2371() {
		assertEquals("Quinton", customers.get(2370).getFirstName());
	}

	@Test
	@DisplayName("Record 2371: LastName is Iossa")
	void LastNameOfRecord2371() {
		assertEquals("Iossa", customers.get(2370).getLastName());
	}

	@Test
	@DisplayName("Record 2371: Company is James R Smith Trucking Co")
	void CompanyOfRecord2371() {
		assertEquals("James R Smith Trucking Co", customers.get(2370).getCompany());
	}

	@Test
	@DisplayName("Record 2371: Address is 1321 S Walker Ave")
	void AddressOfRecord2371() {
		assertEquals("1321 S Walker Ave", customers.get(2370).getAddress());
	}

	@Test
	@DisplayName("Record 2371: City is Oklahoma City")
	void CityOfRecord2371() {
		assertEquals("Oklahoma City", customers.get(2370).getCity());
	}

	@Test
	@DisplayName("Record 2371: County is Oklahoma")
	void CountyOfRecord2371() {
		assertEquals("Oklahoma", customers.get(2370).getCounty());
	}

	@Test
	@DisplayName("Record 2371: State is OK")
	void StateOfRecord2371() {
		assertEquals("OK", customers.get(2370).getState());
	}

	@Test
	@DisplayName("Record 2371: ZIP is 73109")
	void ZIPOfRecord2371() {
		assertEquals("73109", customers.get(2370).getZIP());
	}

	@Test
	@DisplayName("Record 2371: Phone is 405-232-0912")
	void PhoneOfRecord2371() {
		assertEquals("405-232-0912", customers.get(2370).getPhone());
	}

	@Test
	@DisplayName("Record 2371: Fax is 405-232-8239")
	void FaxOfRecord2371() {
		assertEquals("405-232-8239", customers.get(2370).getFax());
	}

	@Test
	@DisplayName("Record 2371: Email is quinton@iossa.com")
	void EmailOfRecord2371() {
		assertEquals("quinton@iossa.com", customers.get(2370).getEmail());
	}

	@Test
	@DisplayName("Record 2371: Web is http://www.quintoniossa.com")
	void WebOfRecord2371() {
		assertEquals("http://www.quintoniossa.com", customers.get(2370).getWeb());
	}
}
