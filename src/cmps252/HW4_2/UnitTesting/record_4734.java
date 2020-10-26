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
class Record_4734 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4734: FirstName is Daren")
	void FirstNameOfRecord4734() {
		assertEquals("Daren", customers.get(4733).getFirstName());
	}

	@Test
	@DisplayName("Record 4734: LastName is Mcdearmon")
	void LastNameOfRecord4734() {
		assertEquals("Mcdearmon", customers.get(4733).getLastName());
	}

	@Test
	@DisplayName("Record 4734: Company is State Medical Society Of Wis")
	void CompanyOfRecord4734() {
		assertEquals("State Medical Society Of Wis", customers.get(4733).getCompany());
	}

	@Test
	@DisplayName("Record 4734: Address is 3541 Oceanic Way")
	void AddressOfRecord4734() {
		assertEquals("3541 Oceanic Way", customers.get(4733).getAddress());
	}

	@Test
	@DisplayName("Record 4734: City is Santa Rosa")
	void CityOfRecord4734() {
		assertEquals("Santa Rosa", customers.get(4733).getCity());
	}

	@Test
	@DisplayName("Record 4734: County is Sonoma")
	void CountyOfRecord4734() {
		assertEquals("Sonoma", customers.get(4733).getCounty());
	}

	@Test
	@DisplayName("Record 4734: State is CA")
	void StateOfRecord4734() {
		assertEquals("CA", customers.get(4733).getState());
	}

	@Test
	@DisplayName("Record 4734: ZIP is 95407")
	void ZIPOfRecord4734() {
		assertEquals("95407", customers.get(4733).getZIP());
	}

	@Test
	@DisplayName("Record 4734: Phone is 707-584-0212")
	void PhoneOfRecord4734() {
		assertEquals("707-584-0212", customers.get(4733).getPhone());
	}

	@Test
	@DisplayName("Record 4734: Fax is 707-584-4376")
	void FaxOfRecord4734() {
		assertEquals("707-584-4376", customers.get(4733).getFax());
	}

	@Test
	@DisplayName("Record 4734: Email is daren@mcdearmon.com")
	void EmailOfRecord4734() {
		assertEquals("daren@mcdearmon.com", customers.get(4733).getEmail());
	}

	@Test
	@DisplayName("Record 4734: Web is http://www.darenmcdearmon.com")
	void WebOfRecord4734() {
		assertEquals("http://www.darenmcdearmon.com", customers.get(4733).getWeb());
	}
}
