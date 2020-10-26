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

@Tag("8")
class Record_638 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 638: FirstName is Lorrie")
	void FirstNameOfRecord638() {
		assertEquals("Lorrie", customers.get(637).getFirstName());
	}

	@Test
	@DisplayName("Record 638: LastName is Holien")
	void LastNameOfRecord638() {
		assertEquals("Holien", customers.get(637).getLastName());
	}

	@Test
	@DisplayName("Record 638: Company is Beals, D Kent Esq")
	void CompanyOfRecord638() {
		assertEquals("Beals, D Kent Esq", customers.get(637).getCompany());
	}

	@Test
	@DisplayName("Record 638: Address is 1718 W 8th St")
	void AddressOfRecord638() {
		assertEquals("1718 W 8th St", customers.get(637).getAddress());
	}

	@Test
	@DisplayName("Record 638: City is Erie")
	void CityOfRecord638() {
		assertEquals("Erie", customers.get(637).getCity());
	}

	@Test
	@DisplayName("Record 638: County is Erie")
	void CountyOfRecord638() {
		assertEquals("Erie", customers.get(637).getCounty());
	}

	@Test
	@DisplayName("Record 638: State is PA")
	void StateOfRecord638() {
		assertEquals("PA", customers.get(637).getState());
	}

	@Test
	@DisplayName("Record 638: ZIP is 16505")
	void ZIPOfRecord638() {
		assertEquals("16505", customers.get(637).getZIP());
	}

	@Test
	@DisplayName("Record 638: Phone is 814-456-9379")
	void PhoneOfRecord638() {
		assertEquals("814-456-9379", customers.get(637).getPhone());
	}

	@Test
	@DisplayName("Record 638: Fax is 814-456-9582")
	void FaxOfRecord638() {
		assertEquals("814-456-9582", customers.get(637).getFax());
	}

	@Test
	@DisplayName("Record 638: Email is lorrie@holien.com")
	void EmailOfRecord638() {
		assertEquals("lorrie@holien.com", customers.get(637).getEmail());
	}

	@Test
	@DisplayName("Record 638: Web is http://www.lorrieholien.com")
	void WebOfRecord638() {
		assertEquals("http://www.lorrieholien.com", customers.get(637).getWeb());
	}
}
