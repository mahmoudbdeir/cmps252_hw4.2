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

@Tag("19")
class Record_2286 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2286: FirstName is Nannie")
	void FirstNameOfRecord2286() {
		assertEquals("Nannie", customers.get(2285).getFirstName());
	}

	@Test
	@DisplayName("Record 2286: LastName is Litterer")
	void LastNameOfRecord2286() {
		assertEquals("Litterer", customers.get(2285).getLastName());
	}

	@Test
	@DisplayName("Record 2286: Company is Frye, William C Esq")
	void CompanyOfRecord2286() {
		assertEquals("Frye, William C Esq", customers.get(2285).getCompany());
	}

	@Test
	@DisplayName("Record 2286: Address is 401 Isom Rd  #-440")
	void AddressOfRecord2286() {
		assertEquals("401 Isom Rd  #-440", customers.get(2285).getAddress());
	}

	@Test
	@DisplayName("Record 2286: City is San Antonio")
	void CityOfRecord2286() {
		assertEquals("San Antonio", customers.get(2285).getCity());
	}

	@Test
	@DisplayName("Record 2286: County is Bexar")
	void CountyOfRecord2286() {
		assertEquals("Bexar", customers.get(2285).getCounty());
	}

	@Test
	@DisplayName("Record 2286: State is TX")
	void StateOfRecord2286() {
		assertEquals("TX", customers.get(2285).getState());
	}

	@Test
	@DisplayName("Record 2286: ZIP is 78216")
	void ZIPOfRecord2286() {
		assertEquals("78216", customers.get(2285).getZIP());
	}

	@Test
	@DisplayName("Record 2286: Phone is 210-340-3048")
	void PhoneOfRecord2286() {
		assertEquals("210-340-3048", customers.get(2285).getPhone());
	}

	@Test
	@DisplayName("Record 2286: Fax is 210-340-5826")
	void FaxOfRecord2286() {
		assertEquals("210-340-5826", customers.get(2285).getFax());
	}

	@Test
	@DisplayName("Record 2286: Email is nannie@litterer.com")
	void EmailOfRecord2286() {
		assertEquals("nannie@litterer.com", customers.get(2285).getEmail());
	}

	@Test
	@DisplayName("Record 2286: Web is http://www.nannielitterer.com")
	void WebOfRecord2286() {
		assertEquals("http://www.nannielitterer.com", customers.get(2285).getWeb());
	}
}
