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

@Tag("47")
class Record_4524 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4524: FirstName is Antonia")
	void FirstNameOfRecord4524() {
		assertEquals("Antonia", customers.get(4523).getFirstName());
	}

	@Test
	@DisplayName("Record 4524: LastName is Alvez")
	void LastNameOfRecord4524() {
		assertEquals("Alvez", customers.get(4523).getLastName());
	}

	@Test
	@DisplayName("Record 4524: Company is R J Carbone Co")
	void CompanyOfRecord4524() {
		assertEquals("R J Carbone Co", customers.get(4523).getCompany());
	}

	@Test
	@DisplayName("Record 4524: Address is Airborne Air Park")
	void AddressOfRecord4524() {
		assertEquals("Airborne Air Park", customers.get(4523).getAddress());
	}

	@Test
	@DisplayName("Record 4524: City is Wilmington")
	void CityOfRecord4524() {
		assertEquals("Wilmington", customers.get(4523).getCity());
	}

	@Test
	@DisplayName("Record 4524: County is Clinton")
	void CountyOfRecord4524() {
		assertEquals("Clinton", customers.get(4523).getCounty());
	}

	@Test
	@DisplayName("Record 4524: State is OH")
	void StateOfRecord4524() {
		assertEquals("OH", customers.get(4523).getState());
	}

	@Test
	@DisplayName("Record 4524: ZIP is 45177")
	void ZIPOfRecord4524() {
		assertEquals("45177", customers.get(4523).getZIP());
	}

	@Test
	@DisplayName("Record 4524: Phone is 937-382-2141")
	void PhoneOfRecord4524() {
		assertEquals("937-382-2141", customers.get(4523).getPhone());
	}

	@Test
	@DisplayName("Record 4524: Fax is 937-382-7612")
	void FaxOfRecord4524() {
		assertEquals("937-382-7612", customers.get(4523).getFax());
	}

	@Test
	@DisplayName("Record 4524: Email is antonia@alvez.com")
	void EmailOfRecord4524() {
		assertEquals("antonia@alvez.com", customers.get(4523).getEmail());
	}

	@Test
	@DisplayName("Record 4524: Web is http://www.antoniaalvez.com")
	void WebOfRecord4524() {
		assertEquals("http://www.antoniaalvez.com", customers.get(4523).getWeb());
	}
}
