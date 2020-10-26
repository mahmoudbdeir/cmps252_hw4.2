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

@Tag("45")
class Record_3471 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3471: FirstName is Adrienne")
	void FirstNameOfRecord3471() {
		assertEquals("Adrienne", customers.get(3470).getFirstName());
	}

	@Test
	@DisplayName("Record 3471: LastName is Betita")
	void LastNameOfRecord3471() {
		assertEquals("Betita", customers.get(3470).getLastName());
	}

	@Test
	@DisplayName("Record 3471: Company is American Office Systems")
	void CompanyOfRecord3471() {
		assertEquals("American Office Systems", customers.get(3470).getCompany());
	}

	@Test
	@DisplayName("Record 3471: Address is 1515 Broad St")
	void AddressOfRecord3471() {
		assertEquals("1515 Broad St", customers.get(3470).getAddress());
	}

	@Test
	@DisplayName("Record 3471: City is Bloomfield")
	void CityOfRecord3471() {
		assertEquals("Bloomfield", customers.get(3470).getCity());
	}

	@Test
	@DisplayName("Record 3471: County is Essex")
	void CountyOfRecord3471() {
		assertEquals("Essex", customers.get(3470).getCounty());
	}

	@Test
	@DisplayName("Record 3471: State is NJ")
	void StateOfRecord3471() {
		assertEquals("NJ", customers.get(3470).getState());
	}

	@Test
	@DisplayName("Record 3471: ZIP is 7003")
	void ZIPOfRecord3471() {
		assertEquals("7003", customers.get(3470).getZIP());
	}

	@Test
	@DisplayName("Record 3471: Phone is 973-893-8219")
	void PhoneOfRecord3471() {
		assertEquals("973-893-8219", customers.get(3470).getPhone());
	}

	@Test
	@DisplayName("Record 3471: Fax is 973-893-1527")
	void FaxOfRecord3471() {
		assertEquals("973-893-1527", customers.get(3470).getFax());
	}

	@Test
	@DisplayName("Record 3471: Email is adrienne@betita.com")
	void EmailOfRecord3471() {
		assertEquals("adrienne@betita.com", customers.get(3470).getEmail());
	}

	@Test
	@DisplayName("Record 3471: Web is http://www.adriennebetita.com")
	void WebOfRecord3471() {
		assertEquals("http://www.adriennebetita.com", customers.get(3470).getWeb());
	}
}
