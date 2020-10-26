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

@Tag("40")
class Record_356 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 356: FirstName is Arnold")
	void FirstNameOfRecord356() {
		assertEquals("Arnold", customers.get(355).getFirstName());
	}

	@Test
	@DisplayName("Record 356: LastName is Albriton")
	void LastNameOfRecord356() {
		assertEquals("Albriton", customers.get(355).getLastName());
	}

	@Test
	@DisplayName("Record 356: Company is Abram, Paul Henry Esq")
	void CompanyOfRecord356() {
		assertEquals("Abram, Paul Henry Esq", customers.get(355).getCompany());
	}

	@Test
	@DisplayName("Record 356: Address is 417 Bunting Ave")
	void AddressOfRecord356() {
		assertEquals("417 Bunting Ave", customers.get(355).getAddress());
	}

	@Test
	@DisplayName("Record 356: City is Trenton")
	void CityOfRecord356() {
		assertEquals("Trenton", customers.get(355).getCity());
	}

	@Test
	@DisplayName("Record 356: County is Mercer")
	void CountyOfRecord356() {
		assertEquals("Mercer", customers.get(355).getCounty());
	}

	@Test
	@DisplayName("Record 356: State is NJ")
	void StateOfRecord356() {
		assertEquals("NJ", customers.get(355).getState());
	}

	@Test
	@DisplayName("Record 356: ZIP is 8611")
	void ZIPOfRecord356() {
		assertEquals("8611", customers.get(355).getZIP());
	}

	@Test
	@DisplayName("Record 356: Phone is 609-396-4338")
	void PhoneOfRecord356() {
		assertEquals("609-396-4338", customers.get(355).getPhone());
	}

	@Test
	@DisplayName("Record 356: Fax is 609-396-0293")
	void FaxOfRecord356() {
		assertEquals("609-396-0293", customers.get(355).getFax());
	}

	@Test
	@DisplayName("Record 356: Email is arnold@albriton.com")
	void EmailOfRecord356() {
		assertEquals("arnold@albriton.com", customers.get(355).getEmail());
	}

	@Test
	@DisplayName("Record 356: Web is http://www.arnoldalbriton.com")
	void WebOfRecord356() {
		assertEquals("http://www.arnoldalbriton.com", customers.get(355).getWeb());
	}
}
