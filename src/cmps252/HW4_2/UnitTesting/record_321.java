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

@Tag("25")
class Record_321 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 321: FirstName is Foster")
	void FirstNameOfRecord321() {
		assertEquals("Foster", customers.get(320).getFirstName());
	}

	@Test
	@DisplayName("Record 321: LastName is Tonas")
	void LastNameOfRecord321() {
		assertEquals("Tonas", customers.get(320).getLastName());
	}

	@Test
	@DisplayName("Record 321: Company is Fessel Siegfriedt & Moeller")
	void CompanyOfRecord321() {
		assertEquals("Fessel Siegfriedt & Moeller", customers.get(320).getCompany());
	}

	@Test
	@DisplayName("Record 321: Address is 336 S Main St")
	void AddressOfRecord321() {
		assertEquals("336 S Main St", customers.get(320).getAddress());
	}

	@Test
	@DisplayName("Record 321: City is Bel Air")
	void CityOfRecord321() {
		assertEquals("Bel Air", customers.get(320).getCity());
	}

	@Test
	@DisplayName("Record 321: County is Harford")
	void CountyOfRecord321() {
		assertEquals("Harford", customers.get(320).getCounty());
	}

	@Test
	@DisplayName("Record 321: State is MD")
	void StateOfRecord321() {
		assertEquals("MD", customers.get(320).getState());
	}

	@Test
	@DisplayName("Record 321: ZIP is 21014")
	void ZIPOfRecord321() {
		assertEquals("21014", customers.get(320).getZIP());
	}

	@Test
	@DisplayName("Record 321: Phone is 410-836-1298")
	void PhoneOfRecord321() {
		assertEquals("410-836-1298", customers.get(320).getPhone());
	}

	@Test
	@DisplayName("Record 321: Fax is 410-836-4737")
	void FaxOfRecord321() {
		assertEquals("410-836-4737", customers.get(320).getFax());
	}

	@Test
	@DisplayName("Record 321: Email is foster@tonas.com")
	void EmailOfRecord321() {
		assertEquals("foster@tonas.com", customers.get(320).getEmail());
	}

	@Test
	@DisplayName("Record 321: Web is http://www.fostertonas.com")
	void WebOfRecord321() {
		assertEquals("http://www.fostertonas.com", customers.get(320).getWeb());
	}
}
