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

@Tag("9")
class Record_4078 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4078: FirstName is Charlie")
	void FirstNameOfRecord4078() {
		assertEquals("Charlie", customers.get(4077).getFirstName());
	}

	@Test
	@DisplayName("Record 4078: LastName is Grohoske")
	void LastNameOfRecord4078() {
		assertEquals("Grohoske", customers.get(4077).getLastName());
	}

	@Test
	@DisplayName("Record 4078: Company is Benoit, Deborah Esq")
	void CompanyOfRecord4078() {
		assertEquals("Benoit, Deborah Esq", customers.get(4077).getCompany());
	}

	@Test
	@DisplayName("Record 4078: Address is 6820 Guadalupe St")
	void AddressOfRecord4078() {
		assertEquals("6820 Guadalupe St", customers.get(4077).getAddress());
	}

	@Test
	@DisplayName("Record 4078: City is Austin")
	void CityOfRecord4078() {
		assertEquals("Austin", customers.get(4077).getCity());
	}

	@Test
	@DisplayName("Record 4078: County is Travis")
	void CountyOfRecord4078() {
		assertEquals("Travis", customers.get(4077).getCounty());
	}

	@Test
	@DisplayName("Record 4078: State is TX")
	void StateOfRecord4078() {
		assertEquals("TX", customers.get(4077).getState());
	}

	@Test
	@DisplayName("Record 4078: ZIP is 78752")
	void ZIPOfRecord4078() {
		assertEquals("78752", customers.get(4077).getZIP());
	}

	@Test
	@DisplayName("Record 4078: Phone is 512-441-5112")
	void PhoneOfRecord4078() {
		assertEquals("512-441-5112", customers.get(4077).getPhone());
	}

	@Test
	@DisplayName("Record 4078: Fax is 512-441-0755")
	void FaxOfRecord4078() {
		assertEquals("512-441-0755", customers.get(4077).getFax());
	}

	@Test
	@DisplayName("Record 4078: Email is charlie@grohoske.com")
	void EmailOfRecord4078() {
		assertEquals("charlie@grohoske.com", customers.get(4077).getEmail());
	}

	@Test
	@DisplayName("Record 4078: Web is http://www.charliegrohoske.com")
	void WebOfRecord4078() {
		assertEquals("http://www.charliegrohoske.com", customers.get(4077).getWeb());
	}
}
