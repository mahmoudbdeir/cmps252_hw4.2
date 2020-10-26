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

@Tag("7")
class Record_1765 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1765: FirstName is Aline")
	void FirstNameOfRecord1765() {
		assertEquals("Aline", customers.get(1764).getFirstName());
	}

	@Test
	@DisplayName("Record 1765: LastName is Mcmillin")
	void LastNameOfRecord1765() {
		assertEquals("Mcmillin", customers.get(1764).getLastName());
	}

	@Test
	@DisplayName("Record 1765: Company is Appleton & Lange")
	void CompanyOfRecord1765() {
		assertEquals("Appleton & Lange", customers.get(1764).getCompany());
	}

	@Test
	@DisplayName("Record 1765: Address is 9710 Cozycroft Ave")
	void AddressOfRecord1765() {
		assertEquals("9710 Cozycroft Ave", customers.get(1764).getAddress());
	}

	@Test
	@DisplayName("Record 1765: City is Chatsworth")
	void CityOfRecord1765() {
		assertEquals("Chatsworth", customers.get(1764).getCity());
	}

	@Test
	@DisplayName("Record 1765: County is Los Angeles")
	void CountyOfRecord1765() {
		assertEquals("Los Angeles", customers.get(1764).getCounty());
	}

	@Test
	@DisplayName("Record 1765: State is CA")
	void StateOfRecord1765() {
		assertEquals("CA", customers.get(1764).getState());
	}

	@Test
	@DisplayName("Record 1765: ZIP is 91311")
	void ZIPOfRecord1765() {
		assertEquals("91311", customers.get(1764).getZIP());
	}

	@Test
	@DisplayName("Record 1765: Phone is 818-998-1372")
	void PhoneOfRecord1765() {
		assertEquals("818-998-1372", customers.get(1764).getPhone());
	}

	@Test
	@DisplayName("Record 1765: Fax is 818-998-2069")
	void FaxOfRecord1765() {
		assertEquals("818-998-2069", customers.get(1764).getFax());
	}

	@Test
	@DisplayName("Record 1765: Email is aline@mcmillin.com")
	void EmailOfRecord1765() {
		assertEquals("aline@mcmillin.com", customers.get(1764).getEmail());
	}

	@Test
	@DisplayName("Record 1765: Web is http://www.alinemcmillin.com")
	void WebOfRecord1765() {
		assertEquals("http://www.alinemcmillin.com", customers.get(1764).getWeb());
	}
}
