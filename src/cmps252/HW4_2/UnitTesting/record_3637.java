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

@Tag("22")
class Record_3637 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3637: FirstName is Connie")
	void FirstNameOfRecord3637() {
		assertEquals("Connie", customers.get(3636).getFirstName());
	}

	@Test
	@DisplayName("Record 3637: LastName is Homby")
	void LastNameOfRecord3637() {
		assertEquals("Homby", customers.get(3636).getLastName());
	}

	@Test
	@DisplayName("Record 3637: Company is Information Systems Mktng Inc")
	void CompanyOfRecord3637() {
		assertEquals("Information Systems Mktng Inc", customers.get(3636).getCompany());
	}

	@Test
	@DisplayName("Record 3637: Address is Midtown")
	void AddressOfRecord3637() {
		assertEquals("Midtown", customers.get(3636).getAddress());
	}

	@Test
	@DisplayName("Record 3637: City is Rochester")
	void CityOfRecord3637() {
		assertEquals("Rochester", customers.get(3636).getCity());
	}

	@Test
	@DisplayName("Record 3637: County is Monroe")
	void CountyOfRecord3637() {
		assertEquals("Monroe", customers.get(3636).getCounty());
	}

	@Test
	@DisplayName("Record 3637: State is NY")
	void StateOfRecord3637() {
		assertEquals("NY", customers.get(3636).getState());
	}

	@Test
	@DisplayName("Record 3637: ZIP is 14604")
	void ZIPOfRecord3637() {
		assertEquals("14604", customers.get(3636).getZIP());
	}

	@Test
	@DisplayName("Record 3637: Phone is 585-865-3283")
	void PhoneOfRecord3637() {
		assertEquals("585-865-3283", customers.get(3636).getPhone());
	}

	@Test
	@DisplayName("Record 3637: Fax is 585-865-8741")
	void FaxOfRecord3637() {
		assertEquals("585-865-8741", customers.get(3636).getFax());
	}

	@Test
	@DisplayName("Record 3637: Email is connie@homby.com")
	void EmailOfRecord3637() {
		assertEquals("connie@homby.com", customers.get(3636).getEmail());
	}

	@Test
	@DisplayName("Record 3637: Web is http://www.conniehomby.com")
	void WebOfRecord3637() {
		assertEquals("http://www.conniehomby.com", customers.get(3636).getWeb());
	}
}
