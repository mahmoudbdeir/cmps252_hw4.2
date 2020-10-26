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

@Tag("30")
class Record_3395 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3395: FirstName is Susanna")
	void FirstNameOfRecord3395() {
		assertEquals("Susanna", customers.get(3394).getFirstName());
	}

	@Test
	@DisplayName("Record 3395: LastName is Kopfer")
	void LastNameOfRecord3395() {
		assertEquals("Kopfer", customers.get(3394).getLastName());
	}

	@Test
	@DisplayName("Record 3395: Company is Martin, Sheree Esq")
	void CompanyOfRecord3395() {
		assertEquals("Martin, Sheree Esq", customers.get(3394).getCompany());
	}

	@Test
	@DisplayName("Record 3395: Address is 1466 Pioneer Way  #-1")
	void AddressOfRecord3395() {
		assertEquals("1466 Pioneer Way  #-1", customers.get(3394).getAddress());
	}

	@Test
	@DisplayName("Record 3395: City is El Cajon")
	void CityOfRecord3395() {
		assertEquals("El Cajon", customers.get(3394).getCity());
	}

	@Test
	@DisplayName("Record 3395: County is San Diego")
	void CountyOfRecord3395() {
		assertEquals("San Diego", customers.get(3394).getCounty());
	}

	@Test
	@DisplayName("Record 3395: State is CA")
	void StateOfRecord3395() {
		assertEquals("CA", customers.get(3394).getState());
	}

	@Test
	@DisplayName("Record 3395: ZIP is 92020")
	void ZIPOfRecord3395() {
		assertEquals("92020", customers.get(3394).getZIP());
	}

	@Test
	@DisplayName("Record 3395: Phone is 619-440-4260")
	void PhoneOfRecord3395() {
		assertEquals("619-440-4260", customers.get(3394).getPhone());
	}

	@Test
	@DisplayName("Record 3395: Fax is 619-440-8565")
	void FaxOfRecord3395() {
		assertEquals("619-440-8565", customers.get(3394).getFax());
	}

	@Test
	@DisplayName("Record 3395: Email is susanna@kopfer.com")
	void EmailOfRecord3395() {
		assertEquals("susanna@kopfer.com", customers.get(3394).getEmail());
	}

	@Test
	@DisplayName("Record 3395: Web is http://www.susannakopfer.com")
	void WebOfRecord3395() {
		assertEquals("http://www.susannakopfer.com", customers.get(3394).getWeb());
	}
}
