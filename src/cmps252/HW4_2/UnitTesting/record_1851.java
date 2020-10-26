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

@Tag("15")
class Record_1851 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1851: FirstName is Allene")
	void FirstNameOfRecord1851() {
		assertEquals("Allene", customers.get(1850).getFirstName());
	}

	@Test
	@DisplayName("Record 1851: LastName is Hirth")
	void LastNameOfRecord1851() {
		assertEquals("Hirth", customers.get(1850).getLastName());
	}

	@Test
	@DisplayName("Record 1851: Company is Mcadams, Shylah H Esq")
	void CompanyOfRecord1851() {
		assertEquals("Mcadams, Shylah H Esq", customers.get(1850).getCompany());
	}

	@Test
	@DisplayName("Record 1851: Address is 29 Domino Dr")
	void AddressOfRecord1851() {
		assertEquals("29 Domino Dr", customers.get(1850).getAddress());
	}

	@Test
	@DisplayName("Record 1851: City is Concord")
	void CityOfRecord1851() {
		assertEquals("Concord", customers.get(1850).getCity());
	}

	@Test
	@DisplayName("Record 1851: County is Middlesex")
	void CountyOfRecord1851() {
		assertEquals("Middlesex", customers.get(1850).getCounty());
	}

	@Test
	@DisplayName("Record 1851: State is MA")
	void StateOfRecord1851() {
		assertEquals("MA", customers.get(1850).getState());
	}

	@Test
	@DisplayName("Record 1851: ZIP is 1742")
	void ZIPOfRecord1851() {
		assertEquals("1742", customers.get(1850).getZIP());
	}

	@Test
	@DisplayName("Record 1851: Phone is 978-371-1854")
	void PhoneOfRecord1851() {
		assertEquals("978-371-1854", customers.get(1850).getPhone());
	}

	@Test
	@DisplayName("Record 1851: Fax is 978-371-3874")
	void FaxOfRecord1851() {
		assertEquals("978-371-3874", customers.get(1850).getFax());
	}

	@Test
	@DisplayName("Record 1851: Email is allene@hirth.com")
	void EmailOfRecord1851() {
		assertEquals("allene@hirth.com", customers.get(1850).getEmail());
	}

	@Test
	@DisplayName("Record 1851: Web is http://www.allenehirth.com")
	void WebOfRecord1851() {
		assertEquals("http://www.allenehirth.com", customers.get(1850).getWeb());
	}
}
