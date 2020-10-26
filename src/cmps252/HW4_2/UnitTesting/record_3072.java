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

@Tag("24")
class Record_3072 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3072: FirstName is Jeremiah")
	void FirstNameOfRecord3072() {
		assertEquals("Jeremiah", customers.get(3071).getFirstName());
	}

	@Test
	@DisplayName("Record 3072: LastName is Caminos")
	void LastNameOfRecord3072() {
		assertEquals("Caminos", customers.get(3071).getLastName());
	}

	@Test
	@DisplayName("Record 3072: Company is Dielectric Coating Industries")
	void CompanyOfRecord3072() {
		assertEquals("Dielectric Coating Industries", customers.get(3071).getCompany());
	}

	@Test
	@DisplayName("Record 3072: Address is 212 E Washington St")
	void AddressOfRecord3072() {
		assertEquals("212 E Washington St", customers.get(3071).getAddress());
	}

	@Test
	@DisplayName("Record 3072: City is Milwaukee")
	void CityOfRecord3072() {
		assertEquals("Milwaukee", customers.get(3071).getCity());
	}

	@Test
	@DisplayName("Record 3072: County is Milwaukee")
	void CountyOfRecord3072() {
		assertEquals("Milwaukee", customers.get(3071).getCounty());
	}

	@Test
	@DisplayName("Record 3072: State is WI")
	void StateOfRecord3072() {
		assertEquals("WI", customers.get(3071).getState());
	}

	@Test
	@DisplayName("Record 3072: ZIP is 53204")
	void ZIPOfRecord3072() {
		assertEquals("53204", customers.get(3071).getZIP());
	}

	@Test
	@DisplayName("Record 3072: Phone is 414-672-1370")
	void PhoneOfRecord3072() {
		assertEquals("414-672-1370", customers.get(3071).getPhone());
	}

	@Test
	@DisplayName("Record 3072: Fax is 414-672-5646")
	void FaxOfRecord3072() {
		assertEquals("414-672-5646", customers.get(3071).getFax());
	}

	@Test
	@DisplayName("Record 3072: Email is jeremiah@caminos.com")
	void EmailOfRecord3072() {
		assertEquals("jeremiah@caminos.com", customers.get(3071).getEmail());
	}

	@Test
	@DisplayName("Record 3072: Web is http://www.jeremiahcaminos.com")
	void WebOfRecord3072() {
		assertEquals("http://www.jeremiahcaminos.com", customers.get(3071).getWeb());
	}
}
