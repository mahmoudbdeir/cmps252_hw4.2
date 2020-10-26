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

@Tag("27")
class Record_3902 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3902: FirstName is Allan")
	void FirstNameOfRecord3902() {
		assertEquals("Allan", customers.get(3901).getFirstName());
	}

	@Test
	@DisplayName("Record 3902: LastName is Lebrecht")
	void LastNameOfRecord3902() {
		assertEquals("Lebrecht", customers.get(3901).getLastName());
	}

	@Test
	@DisplayName("Record 3902: Company is Teague, Graham A Esq")
	void CompanyOfRecord3902() {
		assertEquals("Teague, Graham A Esq", customers.get(3901).getCompany());
	}

	@Test
	@DisplayName("Record 3902: Address is 211 N Robinson Ave")
	void AddressOfRecord3902() {
		assertEquals("211 N Robinson Ave", customers.get(3901).getAddress());
	}

	@Test
	@DisplayName("Record 3902: City is Oklahoma City")
	void CityOfRecord3902() {
		assertEquals("Oklahoma City", customers.get(3901).getCity());
	}

	@Test
	@DisplayName("Record 3902: County is Oklahoma")
	void CountyOfRecord3902() {
		assertEquals("Oklahoma", customers.get(3901).getCounty());
	}

	@Test
	@DisplayName("Record 3902: State is OK")
	void StateOfRecord3902() {
		assertEquals("OK", customers.get(3901).getState());
	}

	@Test
	@DisplayName("Record 3902: ZIP is 73102")
	void ZIPOfRecord3902() {
		assertEquals("73102", customers.get(3901).getZIP());
	}

	@Test
	@DisplayName("Record 3902: Phone is 405-272-5555")
	void PhoneOfRecord3902() {
		assertEquals("405-272-5555", customers.get(3901).getPhone());
	}

	@Test
	@DisplayName("Record 3902: Fax is 405-272-5239")
	void FaxOfRecord3902() {
		assertEquals("405-272-5239", customers.get(3901).getFax());
	}

	@Test
	@DisplayName("Record 3902: Email is allan@lebrecht.com")
	void EmailOfRecord3902() {
		assertEquals("allan@lebrecht.com", customers.get(3901).getEmail());
	}

	@Test
	@DisplayName("Record 3902: Web is http://www.allanlebrecht.com")
	void WebOfRecord3902() {
		assertEquals("http://www.allanlebrecht.com", customers.get(3901).getWeb());
	}
}
