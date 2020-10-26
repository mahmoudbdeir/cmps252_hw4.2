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

@Tag("1")
class Record_3435 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3435: FirstName is Elton")
	void FirstNameOfRecord3435() {
		assertEquals("Elton", customers.get(3434).getFirstName());
	}

	@Test
	@DisplayName("Record 3435: LastName is Handt")
	void LastNameOfRecord3435() {
		assertEquals("Handt", customers.get(3434).getLastName());
	}

	@Test
	@DisplayName("Record 3435: Company is Fennessy, Michelle M Esq")
	void CompanyOfRecord3435() {
		assertEquals("Fennessy, Michelle M Esq", customers.get(3434).getCompany());
	}

	@Test
	@DisplayName("Record 3435: Address is Highway 1")
	void AddressOfRecord3435() {
		assertEquals("Highway 1", customers.get(3434).getAddress());
	}

	@Test
	@DisplayName("Record 3435: City is Cayucos")
	void CityOfRecord3435() {
		assertEquals("Cayucos", customers.get(3434).getCity());
	}

	@Test
	@DisplayName("Record 3435: County is San Luis Obispo")
	void CountyOfRecord3435() {
		assertEquals("San Luis Obispo", customers.get(3434).getCounty());
	}

	@Test
	@DisplayName("Record 3435: State is CA")
	void StateOfRecord3435() {
		assertEquals("CA", customers.get(3434).getState());
	}

	@Test
	@DisplayName("Record 3435: ZIP is 93430")
	void ZIPOfRecord3435() {
		assertEquals("93430", customers.get(3434).getZIP());
	}

	@Test
	@DisplayName("Record 3435: Phone is 805-995-1045")
	void PhoneOfRecord3435() {
		assertEquals("805-995-1045", customers.get(3434).getPhone());
	}

	@Test
	@DisplayName("Record 3435: Fax is 805-995-2896")
	void FaxOfRecord3435() {
		assertEquals("805-995-2896", customers.get(3434).getFax());
	}

	@Test
	@DisplayName("Record 3435: Email is elton@handt.com")
	void EmailOfRecord3435() {
		assertEquals("elton@handt.com", customers.get(3434).getEmail());
	}

	@Test
	@DisplayName("Record 3435: Web is http://www.eltonhandt.com")
	void WebOfRecord3435() {
		assertEquals("http://www.eltonhandt.com", customers.get(3434).getWeb());
	}
}
