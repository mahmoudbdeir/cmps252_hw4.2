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

@Tag("16")
class Record_2655 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2655: FirstName is Leo")
	void FirstNameOfRecord2655() {
		assertEquals("Leo", customers.get(2654).getFirstName());
	}

	@Test
	@DisplayName("Record 2655: LastName is Galetta")
	void LastNameOfRecord2655() {
		assertEquals("Galetta", customers.get(2654).getLastName());
	}

	@Test
	@DisplayName("Record 2655: Company is Klemme, Amelia L Esq")
	void CompanyOfRecord2655() {
		assertEquals("Klemme, Amelia L Esq", customers.get(2654).getCompany());
	}

	@Test
	@DisplayName("Record 2655: Address is 35 E Main St")
	void AddressOfRecord2655() {
		assertEquals("35 E Main St", customers.get(2654).getAddress());
	}

	@Test
	@DisplayName("Record 2655: City is Rockaway")
	void CityOfRecord2655() {
		assertEquals("Rockaway", customers.get(2654).getCity());
	}

	@Test
	@DisplayName("Record 2655: County is Morris")
	void CountyOfRecord2655() {
		assertEquals("Morris", customers.get(2654).getCounty());
	}

	@Test
	@DisplayName("Record 2655: State is NJ")
	void StateOfRecord2655() {
		assertEquals("NJ", customers.get(2654).getState());
	}

	@Test
	@DisplayName("Record 2655: ZIP is 7866")
	void ZIPOfRecord2655() {
		assertEquals("7866", customers.get(2654).getZIP());
	}

	@Test
	@DisplayName("Record 2655: Phone is 973-625-2132")
	void PhoneOfRecord2655() {
		assertEquals("973-625-2132", customers.get(2654).getPhone());
	}

	@Test
	@DisplayName("Record 2655: Fax is 973-625-7963")
	void FaxOfRecord2655() {
		assertEquals("973-625-7963", customers.get(2654).getFax());
	}

	@Test
	@DisplayName("Record 2655: Email is leo@galetta.com")
	void EmailOfRecord2655() {
		assertEquals("leo@galetta.com", customers.get(2654).getEmail());
	}

	@Test
	@DisplayName("Record 2655: Web is http://www.leogaletta.com")
	void WebOfRecord2655() {
		assertEquals("http://www.leogaletta.com", customers.get(2654).getWeb());
	}
}
