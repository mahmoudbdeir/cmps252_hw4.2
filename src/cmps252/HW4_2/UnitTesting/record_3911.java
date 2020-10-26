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
class Record_3911 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3911: FirstName is Annmarie")
	void FirstNameOfRecord3911() {
		assertEquals("Annmarie", customers.get(3910).getFirstName());
	}

	@Test
	@DisplayName("Record 3911: LastName is Finnemore")
	void LastNameOfRecord3911() {
		assertEquals("Finnemore", customers.get(3910).getLastName());
	}

	@Test
	@DisplayName("Record 3911: Company is Rindner, Mark Esq")
	void CompanyOfRecord3911() {
		assertEquals("Rindner, Mark Esq", customers.get(3910).getCompany());
	}

	@Test
	@DisplayName("Record 3911: Address is S College Ave")
	void AddressOfRecord3911() {
		assertEquals("S College Ave", customers.get(3910).getAddress());
	}

	@Test
	@DisplayName("Record 3911: City is Charlotte")
	void CityOfRecord3911() {
		assertEquals("Charlotte", customers.get(3910).getCity());
	}

	@Test
	@DisplayName("Record 3911: County is Mecklenburg")
	void CountyOfRecord3911() {
		assertEquals("Mecklenburg", customers.get(3910).getCounty());
	}

	@Test
	@DisplayName("Record 3911: State is NC")
	void StateOfRecord3911() {
		assertEquals("NC", customers.get(3910).getState());
	}

	@Test
	@DisplayName("Record 3911: ZIP is 28244")
	void ZIPOfRecord3911() {
		assertEquals("28244", customers.get(3910).getZIP());
	}

	@Test
	@DisplayName("Record 3911: Phone is 704-377-0430")
	void PhoneOfRecord3911() {
		assertEquals("704-377-0430", customers.get(3910).getPhone());
	}

	@Test
	@DisplayName("Record 3911: Fax is 704-377-8735")
	void FaxOfRecord3911() {
		assertEquals("704-377-8735", customers.get(3910).getFax());
	}

	@Test
	@DisplayName("Record 3911: Email is annmarie@finnemore.com")
	void EmailOfRecord3911() {
		assertEquals("annmarie@finnemore.com", customers.get(3910).getEmail());
	}

	@Test
	@DisplayName("Record 3911: Web is http://www.annmariefinnemore.com")
	void WebOfRecord3911() {
		assertEquals("http://www.annmariefinnemore.com", customers.get(3910).getWeb());
	}
}
