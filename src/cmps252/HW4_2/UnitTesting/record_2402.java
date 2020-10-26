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

@Tag("40")
class Record_2402 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2402: FirstName is Ferdinand")
	void FirstNameOfRecord2402() {
		assertEquals("Ferdinand", customers.get(2401).getFirstName());
	}

	@Test
	@DisplayName("Record 2402: LastName is Thiery")
	void LastNameOfRecord2402() {
		assertEquals("Thiery", customers.get(2401).getLastName());
	}

	@Test
	@DisplayName("Record 2402: Company is Reece, Joseph L Esq")
	void CompanyOfRecord2402() {
		assertEquals("Reece, Joseph L Esq", customers.get(2401).getCompany());
	}

	@Test
	@DisplayName("Record 2402: Address is Front")
	void AddressOfRecord2402() {
		assertEquals("Front", customers.get(2401).getAddress());
	}

	@Test
	@DisplayName("Record 2402: City is Media")
	void CityOfRecord2402() {
		assertEquals("Media", customers.get(2401).getCity());
	}

	@Test
	@DisplayName("Record 2402: County is Delaware")
	void CountyOfRecord2402() {
		assertEquals("Delaware", customers.get(2401).getCounty());
	}

	@Test
	@DisplayName("Record 2402: State is PA")
	void StateOfRecord2402() {
		assertEquals("PA", customers.get(2401).getState());
	}

	@Test
	@DisplayName("Record 2402: ZIP is 19063")
	void ZIPOfRecord2402() {
		assertEquals("19063", customers.get(2401).getZIP());
	}

	@Test
	@DisplayName("Record 2402: Phone is 610-565-1877")
	void PhoneOfRecord2402() {
		assertEquals("610-565-1877", customers.get(2401).getPhone());
	}

	@Test
	@DisplayName("Record 2402: Fax is 610-565-1069")
	void FaxOfRecord2402() {
		assertEquals("610-565-1069", customers.get(2401).getFax());
	}

	@Test
	@DisplayName("Record 2402: Email is ferdinand@thiery.com")
	void EmailOfRecord2402() {
		assertEquals("ferdinand@thiery.com", customers.get(2401).getEmail());
	}

	@Test
	@DisplayName("Record 2402: Web is http://www.ferdinandthiery.com")
	void WebOfRecord2402() {
		assertEquals("http://www.ferdinandthiery.com", customers.get(2401).getWeb());
	}
}
