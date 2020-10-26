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
class Record_3397 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3397: FirstName is Eduardo")
	void FirstNameOfRecord3397() {
		assertEquals("Eduardo", customers.get(3396).getFirstName());
	}

	@Test
	@DisplayName("Record 3397: LastName is Rubalcave")
	void LastNameOfRecord3397() {
		assertEquals("Rubalcave", customers.get(3396).getLastName());
	}

	@Test
	@DisplayName("Record 3397: Company is Doyle, Hugh J Esq")
	void CompanyOfRecord3397() {
		assertEquals("Doyle, Hugh J Esq", customers.get(3396).getCompany());
	}

	@Test
	@DisplayName("Record 3397: Address is 635 Paularino Ave")
	void AddressOfRecord3397() {
		assertEquals("635 Paularino Ave", customers.get(3396).getAddress());
	}

	@Test
	@DisplayName("Record 3397: City is Costa Mesa")
	void CityOfRecord3397() {
		assertEquals("Costa Mesa", customers.get(3396).getCity());
	}

	@Test
	@DisplayName("Record 3397: County is Orange")
	void CountyOfRecord3397() {
		assertEquals("Orange", customers.get(3396).getCounty());
	}

	@Test
	@DisplayName("Record 3397: State is CA")
	void StateOfRecord3397() {
		assertEquals("CA", customers.get(3396).getState());
	}

	@Test
	@DisplayName("Record 3397: ZIP is 92626")
	void ZIPOfRecord3397() {
		assertEquals("92626", customers.get(3396).getZIP());
	}

	@Test
	@DisplayName("Record 3397: Phone is 949-432-8473")
	void PhoneOfRecord3397() {
		assertEquals("949-432-8473", customers.get(3396).getPhone());
	}

	@Test
	@DisplayName("Record 3397: Fax is 949-432-5965")
	void FaxOfRecord3397() {
		assertEquals("949-432-5965", customers.get(3396).getFax());
	}

	@Test
	@DisplayName("Record 3397: Email is eduardo@rubalcave.com")
	void EmailOfRecord3397() {
		assertEquals("eduardo@rubalcave.com", customers.get(3396).getEmail());
	}

	@Test
	@DisplayName("Record 3397: Web is http://www.eduardorubalcave.com")
	void WebOfRecord3397() {
		assertEquals("http://www.eduardorubalcave.com", customers.get(3396).getWeb());
	}
}
