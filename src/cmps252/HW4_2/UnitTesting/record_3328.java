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

@Tag("6")
class Record_3328 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3328: FirstName is Hydi")
	void FirstNameOfRecord3328() {
		assertEquals("Hydi", customers.get(3327).getFirstName());
	}

	@Test
	@DisplayName("Record 3328: LastName is Tartt")
	void LastNameOfRecord3328() {
		assertEquals("Tartt", customers.get(3327).getLastName());
	}

	@Test
	@DisplayName("Record 3328: Company is Hague, Michael B Esq")
	void CompanyOfRecord3328() {
		assertEquals("Hague, Michael B Esq", customers.get(3327).getCompany());
	}

	@Test
	@DisplayName("Record 3328: Address is Texaco")
	void AddressOfRecord3328() {
		assertEquals("Texaco", customers.get(3327).getAddress());
	}

	@Test
	@DisplayName("Record 3328: City is New Orleans")
	void CityOfRecord3328() {
		assertEquals("New Orleans", customers.get(3327).getCity());
	}

	@Test
	@DisplayName("Record 3328: County is Orleans")
	void CountyOfRecord3328() {
		assertEquals("Orleans", customers.get(3327).getCounty());
	}

	@Test
	@DisplayName("Record 3328: State is LA")
	void StateOfRecord3328() {
		assertEquals("LA", customers.get(3327).getState());
	}

	@Test
	@DisplayName("Record 3328: ZIP is 70130")
	void ZIPOfRecord3328() {
		assertEquals("70130", customers.get(3327).getZIP());
	}

	@Test
	@DisplayName("Record 3328: Phone is 504-568-1791")
	void PhoneOfRecord3328() {
		assertEquals("504-568-1791", customers.get(3327).getPhone());
	}

	@Test
	@DisplayName("Record 3328: Fax is 504-568-8728")
	void FaxOfRecord3328() {
		assertEquals("504-568-8728", customers.get(3327).getFax());
	}

	@Test
	@DisplayName("Record 3328: Email is hydi@tartt.com")
	void EmailOfRecord3328() {
		assertEquals("hydi@tartt.com", customers.get(3327).getEmail());
	}

	@Test
	@DisplayName("Record 3328: Web is http://www.hyditartt.com")
	void WebOfRecord3328() {
		assertEquals("http://www.hyditartt.com", customers.get(3327).getWeb());
	}
}
