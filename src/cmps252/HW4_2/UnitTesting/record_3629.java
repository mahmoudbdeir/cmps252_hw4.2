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
class Record_3629 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3629: FirstName is Lana")
	void FirstNameOfRecord3629() {
		assertEquals("Lana", customers.get(3628).getFirstName());
	}

	@Test
	@DisplayName("Record 3629: LastName is Krasnansky")
	void LastNameOfRecord3629() {
		assertEquals("Krasnansky", customers.get(3628).getLastName());
	}

	@Test
	@DisplayName("Record 3629: Company is Topicz")
	void CompanyOfRecord3629() {
		assertEquals("Topicz", customers.get(3628).getCompany());
	}

	@Test
	@DisplayName("Record 3629: Address is 4713 Tuscarawas St W")
	void AddressOfRecord3629() {
		assertEquals("4713 Tuscarawas St W", customers.get(3628).getAddress());
	}

	@Test
	@DisplayName("Record 3629: City is Canton")
	void CityOfRecord3629() {
		assertEquals("Canton", customers.get(3628).getCity());
	}

	@Test
	@DisplayName("Record 3629: County is Stark")
	void CountyOfRecord3629() {
		assertEquals("Stark", customers.get(3628).getCounty());
	}

	@Test
	@DisplayName("Record 3629: State is OH")
	void StateOfRecord3629() {
		assertEquals("OH", customers.get(3628).getState());
	}

	@Test
	@DisplayName("Record 3629: ZIP is 44708")
	void ZIPOfRecord3629() {
		assertEquals("44708", customers.get(3628).getZIP());
	}

	@Test
	@DisplayName("Record 3629: Phone is 330-477-2881")
	void PhoneOfRecord3629() {
		assertEquals("330-477-2881", customers.get(3628).getPhone());
	}

	@Test
	@DisplayName("Record 3629: Fax is 330-477-3425")
	void FaxOfRecord3629() {
		assertEquals("330-477-3425", customers.get(3628).getFax());
	}

	@Test
	@DisplayName("Record 3629: Email is lana@krasnansky.com")
	void EmailOfRecord3629() {
		assertEquals("lana@krasnansky.com", customers.get(3628).getEmail());
	}

	@Test
	@DisplayName("Record 3629: Web is http://www.lanakrasnansky.com")
	void WebOfRecord3629() {
		assertEquals("http://www.lanakrasnansky.com", customers.get(3628).getWeb());
	}
}
