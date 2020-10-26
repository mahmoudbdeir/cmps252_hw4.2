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
class Record_3627 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3627: FirstName is Marsha")
	void FirstNameOfRecord3627() {
		assertEquals("Marsha", customers.get(3626).getFirstName());
	}

	@Test
	@DisplayName("Record 3627: LastName is Mathewson")
	void LastNameOfRecord3627() {
		assertEquals("Mathewson", customers.get(3626).getLastName());
	}

	@Test
	@DisplayName("Record 3627: Company is Hillcrest Hyghts Exxon")
	void CompanyOfRecord3627() {
		assertEquals("Hillcrest Hyghts Exxon", customers.get(3626).getCompany());
	}

	@Test
	@DisplayName("Record 3627: Address is Pere Marquette")
	void AddressOfRecord3627() {
		assertEquals("Pere Marquette", customers.get(3626).getAddress());
	}

	@Test
	@DisplayName("Record 3627: City is New Orleans")
	void CityOfRecord3627() {
		assertEquals("New Orleans", customers.get(3626).getCity());
	}

	@Test
	@DisplayName("Record 3627: County is Orleans")
	void CountyOfRecord3627() {
		assertEquals("Orleans", customers.get(3626).getCounty());
	}

	@Test
	@DisplayName("Record 3627: State is LA")
	void StateOfRecord3627() {
		assertEquals("LA", customers.get(3626).getState());
	}

	@Test
	@DisplayName("Record 3627: ZIP is 70112")
	void ZIPOfRecord3627() {
		assertEquals("70112", customers.get(3626).getZIP());
	}

	@Test
	@DisplayName("Record 3627: Phone is 504-525-7374")
	void PhoneOfRecord3627() {
		assertEquals("504-525-7374", customers.get(3626).getPhone());
	}

	@Test
	@DisplayName("Record 3627: Fax is 504-525-0081")
	void FaxOfRecord3627() {
		assertEquals("504-525-0081", customers.get(3626).getFax());
	}

	@Test
	@DisplayName("Record 3627: Email is marsha@mathewson.com")
	void EmailOfRecord3627() {
		assertEquals("marsha@mathewson.com", customers.get(3626).getEmail());
	}

	@Test
	@DisplayName("Record 3627: Web is http://www.marshamathewson.com")
	void WebOfRecord3627() {
		assertEquals("http://www.marshamathewson.com", customers.get(3626).getWeb());
	}
}
