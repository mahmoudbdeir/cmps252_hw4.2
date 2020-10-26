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

@Tag("12")
class Record_4875 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4875: FirstName is Alene")
	void FirstNameOfRecord4875() {
		assertEquals("Alene", customers.get(4874).getFirstName());
	}

	@Test
	@DisplayName("Record 4875: LastName is Hiday")
	void LastNameOfRecord4875() {
		assertEquals("Hiday", customers.get(4874).getLastName());
	}

	@Test
	@DisplayName("Record 4875: Company is Cap Grossman Co Inc")
	void CompanyOfRecord4875() {
		assertEquals("Cap Grossman Co Inc", customers.get(4874).getCompany());
	}

	@Test
	@DisplayName("Record 4875: Address is 7106 Dublin Blvd")
	void AddressOfRecord4875() {
		assertEquals("7106 Dublin Blvd", customers.get(4874).getAddress());
	}

	@Test
	@DisplayName("Record 4875: City is Dublin")
	void CityOfRecord4875() {
		assertEquals("Dublin", customers.get(4874).getCity());
	}

	@Test
	@DisplayName("Record 4875: County is Alameda")
	void CountyOfRecord4875() {
		assertEquals("Alameda", customers.get(4874).getCounty());
	}

	@Test
	@DisplayName("Record 4875: State is CA")
	void StateOfRecord4875() {
		assertEquals("CA", customers.get(4874).getState());
	}

	@Test
	@DisplayName("Record 4875: ZIP is 94568")
	void ZIPOfRecord4875() {
		assertEquals("94568", customers.get(4874).getZIP());
	}

	@Test
	@DisplayName("Record 4875: Phone is 925-828-4529")
	void PhoneOfRecord4875() {
		assertEquals("925-828-4529", customers.get(4874).getPhone());
	}

	@Test
	@DisplayName("Record 4875: Fax is 925-828-0744")
	void FaxOfRecord4875() {
		assertEquals("925-828-0744", customers.get(4874).getFax());
	}

	@Test
	@DisplayName("Record 4875: Email is alene@hiday.com")
	void EmailOfRecord4875() {
		assertEquals("alene@hiday.com", customers.get(4874).getEmail());
	}

	@Test
	@DisplayName("Record 4875: Web is http://www.alenehiday.com")
	void WebOfRecord4875() {
		assertEquals("http://www.alenehiday.com", customers.get(4874).getWeb());
	}
}
