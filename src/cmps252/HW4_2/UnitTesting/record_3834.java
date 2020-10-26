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

@Tag("11")
class Record_3834 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3834: FirstName is Sallie")
	void FirstNameOfRecord3834() {
		assertEquals("Sallie", customers.get(3833).getFirstName());
	}

	@Test
	@DisplayName("Record 3834: LastName is Trowers")
	void LastNameOfRecord3834() {
		assertEquals("Trowers", customers.get(3833).getLastName());
	}

	@Test
	@DisplayName("Record 3834: Company is A & M Metals Inc")
	void CompanyOfRecord3834() {
		assertEquals("A & M Metals Inc", customers.get(3833).getCompany());
	}

	@Test
	@DisplayName("Record 3834: Address is 654 S 2nd Ave")
	void AddressOfRecord3834() {
		assertEquals("654 S 2nd Ave", customers.get(3833).getAddress());
	}

	@Test
	@DisplayName("Record 3834: City is Covina")
	void CityOfRecord3834() {
		assertEquals("Covina", customers.get(3833).getCity());
	}

	@Test
	@DisplayName("Record 3834: County is Los Angeles")
	void CountyOfRecord3834() {
		assertEquals("Los Angeles", customers.get(3833).getCounty());
	}

	@Test
	@DisplayName("Record 3834: State is CA")
	void StateOfRecord3834() {
		assertEquals("CA", customers.get(3833).getState());
	}

	@Test
	@DisplayName("Record 3834: ZIP is 91723")
	void ZIPOfRecord3834() {
		assertEquals("91723", customers.get(3833).getZIP());
	}

	@Test
	@DisplayName("Record 3834: Phone is 626-966-7986")
	void PhoneOfRecord3834() {
		assertEquals("626-966-7986", customers.get(3833).getPhone());
	}

	@Test
	@DisplayName("Record 3834: Fax is 626-966-6404")
	void FaxOfRecord3834() {
		assertEquals("626-966-6404", customers.get(3833).getFax());
	}

	@Test
	@DisplayName("Record 3834: Email is sallie@trowers.com")
	void EmailOfRecord3834() {
		assertEquals("sallie@trowers.com", customers.get(3833).getEmail());
	}

	@Test
	@DisplayName("Record 3834: Web is http://www.sallietrowers.com")
	void WebOfRecord3834() {
		assertEquals("http://www.sallietrowers.com", customers.get(3833).getWeb());
	}
}
