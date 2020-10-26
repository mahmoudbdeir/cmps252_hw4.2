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

@Tag("29")
class Record_576 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 576: FirstName is Jeremy")
	void FirstNameOfRecord576() {
		assertEquals("Jeremy", customers.get(575).getFirstName());
	}

	@Test
	@DisplayName("Record 576: LastName is Sloat")
	void LastNameOfRecord576() {
		assertEquals("Sloat", customers.get(575).getLastName());
	}

	@Test
	@DisplayName("Record 576: Company is Kenton Times")
	void CompanyOfRecord576() {
		assertEquals("Kenton Times", customers.get(575).getCompany());
	}

	@Test
	@DisplayName("Record 576: Address is 460 Cabot Rd")
	void AddressOfRecord576() {
		assertEquals("460 Cabot Rd", customers.get(575).getAddress());
	}

	@Test
	@DisplayName("Record 576: City is South San Francisco")
	void CityOfRecord576() {
		assertEquals("South San Francisco", customers.get(575).getCity());
	}

	@Test
	@DisplayName("Record 576: County is San Mateo")
	void CountyOfRecord576() {
		assertEquals("San Mateo", customers.get(575).getCounty());
	}

	@Test
	@DisplayName("Record 576: State is CA")
	void StateOfRecord576() {
		assertEquals("CA", customers.get(575).getState());
	}

	@Test
	@DisplayName("Record 576: ZIP is 94080")
	void ZIPOfRecord576() {
		assertEquals("94080", customers.get(575).getZIP());
	}

	@Test
	@DisplayName("Record 576: Phone is 650-871-6491")
	void PhoneOfRecord576() {
		assertEquals("650-871-6491", customers.get(575).getPhone());
	}

	@Test
	@DisplayName("Record 576: Fax is 650-871-2613")
	void FaxOfRecord576() {
		assertEquals("650-871-2613", customers.get(575).getFax());
	}

	@Test
	@DisplayName("Record 576: Email is jeremy@sloat.com")
	void EmailOfRecord576() {
		assertEquals("jeremy@sloat.com", customers.get(575).getEmail());
	}

	@Test
	@DisplayName("Record 576: Web is http://www.jeremysloat.com")
	void WebOfRecord576() {
		assertEquals("http://www.jeremysloat.com", customers.get(575).getWeb());
	}
}
