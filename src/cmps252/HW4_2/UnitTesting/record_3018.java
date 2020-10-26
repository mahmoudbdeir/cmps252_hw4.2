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

@Tag("19")
class Record_3018 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3018: FirstName is Nannie")
	void FirstNameOfRecord3018() {
		assertEquals("Nannie", customers.get(3017).getFirstName());
	}

	@Test
	@DisplayName("Record 3018: LastName is Kossey")
	void LastNameOfRecord3018() {
		assertEquals("Kossey", customers.get(3017).getLastName());
	}

	@Test
	@DisplayName("Record 3018: Company is Polaniecki, Elliott Esq")
	void CompanyOfRecord3018() {
		assertEquals("Polaniecki, Elliott Esq", customers.get(3017).getCompany());
	}

	@Test
	@DisplayName("Record 3018: Address is 2052 Newport Blvd  #-6")
	void AddressOfRecord3018() {
		assertEquals("2052 Newport Blvd  #-6", customers.get(3017).getAddress());
	}

	@Test
	@DisplayName("Record 3018: City is Costa Mesa")
	void CityOfRecord3018() {
		assertEquals("Costa Mesa", customers.get(3017).getCity());
	}

	@Test
	@DisplayName("Record 3018: County is Orange")
	void CountyOfRecord3018() {
		assertEquals("Orange", customers.get(3017).getCounty());
	}

	@Test
	@DisplayName("Record 3018: State is CA")
	void StateOfRecord3018() {
		assertEquals("CA", customers.get(3017).getState());
	}

	@Test
	@DisplayName("Record 3018: ZIP is 92627")
	void ZIPOfRecord3018() {
		assertEquals("92627", customers.get(3017).getZIP());
	}

	@Test
	@DisplayName("Record 3018: Phone is 949-631-6604")
	void PhoneOfRecord3018() {
		assertEquals("949-631-6604", customers.get(3017).getPhone());
	}

	@Test
	@DisplayName("Record 3018: Fax is 949-631-4107")
	void FaxOfRecord3018() {
		assertEquals("949-631-4107", customers.get(3017).getFax());
	}

	@Test
	@DisplayName("Record 3018: Email is nannie@kossey.com")
	void EmailOfRecord3018() {
		assertEquals("nannie@kossey.com", customers.get(3017).getEmail());
	}

	@Test
	@DisplayName("Record 3018: Web is http://www.nanniekossey.com")
	void WebOfRecord3018() {
		assertEquals("http://www.nanniekossey.com", customers.get(3017).getWeb());
	}
}
