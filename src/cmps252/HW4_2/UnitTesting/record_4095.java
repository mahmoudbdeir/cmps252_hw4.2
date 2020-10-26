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

@Tag("2")
class Record_4095 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4095: FirstName is Pamala")
	void FirstNameOfRecord4095() {
		assertEquals("Pamala", customers.get(4094).getFirstName());
	}

	@Test
	@DisplayName("Record 4095: LastName is Langholz")
	void LastNameOfRecord4095() {
		assertEquals("Langholz", customers.get(4094).getLastName());
	}

	@Test
	@DisplayName("Record 4095: Company is Anderlini Guheen Finkelstone")
	void CompanyOfRecord4095() {
		assertEquals("Anderlini Guheen Finkelstone", customers.get(4094).getCompany());
	}

	@Test
	@DisplayName("Record 4095: Address is 10015 Walford Ave")
	void AddressOfRecord4095() {
		assertEquals("10015 Walford Ave", customers.get(4094).getAddress());
	}

	@Test
	@DisplayName("Record 4095: City is Cleveland")
	void CityOfRecord4095() {
		assertEquals("Cleveland", customers.get(4094).getCity());
	}

	@Test
	@DisplayName("Record 4095: County is Cuyahoga")
	void CountyOfRecord4095() {
		assertEquals("Cuyahoga", customers.get(4094).getCounty());
	}

	@Test
	@DisplayName("Record 4095: State is OH")
	void StateOfRecord4095() {
		assertEquals("OH", customers.get(4094).getState());
	}

	@Test
	@DisplayName("Record 4095: ZIP is 44102")
	void ZIPOfRecord4095() {
		assertEquals("44102", customers.get(4094).getZIP());
	}

	@Test
	@DisplayName("Record 4095: Phone is 216-961-7368")
	void PhoneOfRecord4095() {
		assertEquals("216-961-7368", customers.get(4094).getPhone());
	}

	@Test
	@DisplayName("Record 4095: Fax is 216-961-7454")
	void FaxOfRecord4095() {
		assertEquals("216-961-7454", customers.get(4094).getFax());
	}

	@Test
	@DisplayName("Record 4095: Email is pamala@langholz.com")
	void EmailOfRecord4095() {
		assertEquals("pamala@langholz.com", customers.get(4094).getEmail());
	}

	@Test
	@DisplayName("Record 4095: Web is http://www.pamalalangholz.com")
	void WebOfRecord4095() {
		assertEquals("http://www.pamalalangholz.com", customers.get(4094).getWeb());
	}
}
