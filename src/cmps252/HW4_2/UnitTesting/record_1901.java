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
class Record_1901 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1901: FirstName is Bernice")
	void FirstNameOfRecord1901() {
		assertEquals("Bernice", customers.get(1900).getFirstName());
	}

	@Test
	@DisplayName("Record 1901: LastName is Knier")
	void LastNameOfRecord1901() {
		assertEquals("Knier", customers.get(1900).getLastName());
	}

	@Test
	@DisplayName("Record 1901: Company is Crown Trophy Ii Inc")
	void CompanyOfRecord1901() {
		assertEquals("Crown Trophy Ii Inc", customers.get(1900).getCompany());
	}

	@Test
	@DisplayName("Record 1901: Address is Drakestown Rd")
	void AddressOfRecord1901() {
		assertEquals("Drakestown Rd", customers.get(1900).getAddress());
	}

	@Test
	@DisplayName("Record 1901: City is Hackettstown")
	void CityOfRecord1901() {
		assertEquals("Hackettstown", customers.get(1900).getCity());
	}

	@Test
	@DisplayName("Record 1901: County is Warren")
	void CountyOfRecord1901() {
		assertEquals("Warren", customers.get(1900).getCounty());
	}

	@Test
	@DisplayName("Record 1901: State is NJ")
	void StateOfRecord1901() {
		assertEquals("NJ", customers.get(1900).getState());
	}

	@Test
	@DisplayName("Record 1901: ZIP is 7840")
	void ZIPOfRecord1901() {
		assertEquals("7840", customers.get(1900).getZIP());
	}

	@Test
	@DisplayName("Record 1901: Phone is 908-850-5005")
	void PhoneOfRecord1901() {
		assertEquals("908-850-5005", customers.get(1900).getPhone());
	}

	@Test
	@DisplayName("Record 1901: Fax is 908-850-5498")
	void FaxOfRecord1901() {
		assertEquals("908-850-5498", customers.get(1900).getFax());
	}

	@Test
	@DisplayName("Record 1901: Email is bernice@knier.com")
	void EmailOfRecord1901() {
		assertEquals("bernice@knier.com", customers.get(1900).getEmail());
	}

	@Test
	@DisplayName("Record 1901: Web is http://www.berniceknier.com")
	void WebOfRecord1901() {
		assertEquals("http://www.berniceknier.com", customers.get(1900).getWeb());
	}
}
