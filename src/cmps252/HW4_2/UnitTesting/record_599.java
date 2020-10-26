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

@Tag("37")
class Record_599 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 599: FirstName is Hoyt")
	void FirstNameOfRecord599() {
		assertEquals("Hoyt", customers.get(598).getFirstName());
	}

	@Test
	@DisplayName("Record 599: LastName is Myninger")
	void LastNameOfRecord599() {
		assertEquals("Myninger", customers.get(598).getLastName());
	}

	@Test
	@DisplayName("Record 599: Company is Club Lamaison Hlth & Fitns")
	void CompanyOfRecord599() {
		assertEquals("Club Lamaison Hlth & Fitns", customers.get(598).getCompany());
	}

	@Test
	@DisplayName("Record 599: Address is 3650 Iles Ave")
	void AddressOfRecord599() {
		assertEquals("3650 Iles Ave", customers.get(598).getAddress());
	}

	@Test
	@DisplayName("Record 599: City is Farmington")
	void CityOfRecord599() {
		assertEquals("Farmington", customers.get(598).getCity());
	}

	@Test
	@DisplayName("Record 599: County is San Juan")
	void CountyOfRecord599() {
		assertEquals("San Juan", customers.get(598).getCounty());
	}

	@Test
	@DisplayName("Record 599: State is NM")
	void StateOfRecord599() {
		assertEquals("NM", customers.get(598).getState());
	}

	@Test
	@DisplayName("Record 599: ZIP is 87402")
	void ZIPOfRecord599() {
		assertEquals("87402", customers.get(598).getZIP());
	}

	@Test
	@DisplayName("Record 599: Phone is 505-326-3040")
	void PhoneOfRecord599() {
		assertEquals("505-326-3040", customers.get(598).getPhone());
	}

	@Test
	@DisplayName("Record 599: Fax is 505-326-9442")
	void FaxOfRecord599() {
		assertEquals("505-326-9442", customers.get(598).getFax());
	}

	@Test
	@DisplayName("Record 599: Email is hoyt@myninger.com")
	void EmailOfRecord599() {
		assertEquals("hoyt@myninger.com", customers.get(598).getEmail());
	}

	@Test
	@DisplayName("Record 599: Web is http://www.hoytmyninger.com")
	void WebOfRecord599() {
		assertEquals("http://www.hoytmyninger.com", customers.get(598).getWeb());
	}
}
