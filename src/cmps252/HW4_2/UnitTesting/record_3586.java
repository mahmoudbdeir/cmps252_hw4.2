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
class Record_3586 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3586: FirstName is Beatrice")
	void FirstNameOfRecord3586() {
		assertEquals("Beatrice", customers.get(3585).getFirstName());
	}

	@Test
	@DisplayName("Record 3586: LastName is Ginter")
	void LastNameOfRecord3586() {
		assertEquals("Ginter", customers.get(3585).getLastName());
	}

	@Test
	@DisplayName("Record 3586: Company is Bateman Bros Lumber")
	void CompanyOfRecord3586() {
		assertEquals("Bateman Bros Lumber", customers.get(3585).getCompany());
	}

	@Test
	@DisplayName("Record 3586: Address is Station Square Three")
	void AddressOfRecord3586() {
		assertEquals("Station Square Three", customers.get(3585).getAddress());
	}

	@Test
	@DisplayName("Record 3586: City is Paoli")
	void CityOfRecord3586() {
		assertEquals("Paoli", customers.get(3585).getCity());
	}

	@Test
	@DisplayName("Record 3586: County is Chester")
	void CountyOfRecord3586() {
		assertEquals("Chester", customers.get(3585).getCounty());
	}

	@Test
	@DisplayName("Record 3586: State is PA")
	void StateOfRecord3586() {
		assertEquals("PA", customers.get(3585).getState());
	}

	@Test
	@DisplayName("Record 3586: ZIP is 19301")
	void ZIPOfRecord3586() {
		assertEquals("19301", customers.get(3585).getZIP());
	}

	@Test
	@DisplayName("Record 3586: Phone is 610-647-3849")
	void PhoneOfRecord3586() {
		assertEquals("610-647-3849", customers.get(3585).getPhone());
	}

	@Test
	@DisplayName("Record 3586: Fax is 610-647-7471")
	void FaxOfRecord3586() {
		assertEquals("610-647-7471", customers.get(3585).getFax());
	}

	@Test
	@DisplayName("Record 3586: Email is beatrice@ginter.com")
	void EmailOfRecord3586() {
		assertEquals("beatrice@ginter.com", customers.get(3585).getEmail());
	}

	@Test
	@DisplayName("Record 3586: Web is http://www.beatriceginter.com")
	void WebOfRecord3586() {
		assertEquals("http://www.beatriceginter.com", customers.get(3585).getWeb());
	}
}
