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
class Record_999 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 999: FirstName is Marietta")
	void FirstNameOfRecord999() {
		assertEquals("Marietta", customers.get(998).getFirstName());
	}

	@Test
	@DisplayName("Record 999: LastName is Denkins")
	void LastNameOfRecord999() {
		assertEquals("Denkins", customers.get(998).getLastName());
	}

	@Test
	@DisplayName("Record 999: Company is Benedict, J J Esq")
	void CompanyOfRecord999() {
		assertEquals("Benedict, J J Esq", customers.get(998).getCompany());
	}

	@Test
	@DisplayName("Record 999: Address is 1714 E Northwest Hwy")
	void AddressOfRecord999() {
		assertEquals("1714 E Northwest Hwy", customers.get(998).getAddress());
	}

	@Test
	@DisplayName("Record 999: City is Arlington Hyghts")
	void CityOfRecord999() {
		assertEquals("Arlington Hyghts", customers.get(998).getCity());
	}

	@Test
	@DisplayName("Record 999: County is Cook")
	void CountyOfRecord999() {
		assertEquals("Cook", customers.get(998).getCounty());
	}

	@Test
	@DisplayName("Record 999: State is IL")
	void StateOfRecord999() {
		assertEquals("IL", customers.get(998).getState());
	}

	@Test
	@DisplayName("Record 999: ZIP is 60004")
	void ZIPOfRecord999() {
		assertEquals("60004", customers.get(998).getZIP());
	}

	@Test
	@DisplayName("Record 999: Phone is 847-398-9743")
	void PhoneOfRecord999() {
		assertEquals("847-398-9743", customers.get(998).getPhone());
	}

	@Test
	@DisplayName("Record 999: Fax is 847-398-7329")
	void FaxOfRecord999() {
		assertEquals("847-398-7329", customers.get(998).getFax());
	}

	@Test
	@DisplayName("Record 999: Email is marietta@denkins.com")
	void EmailOfRecord999() {
		assertEquals("marietta@denkins.com", customers.get(998).getEmail());
	}

	@Test
	@DisplayName("Record 999: Web is http://www.mariettadenkins.com")
	void WebOfRecord999() {
		assertEquals("http://www.mariettadenkins.com", customers.get(998).getWeb());
	}
}
