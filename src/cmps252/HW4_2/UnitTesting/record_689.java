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
class Record_689 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 689: FirstName is Lynwood")
	void FirstNameOfRecord689() {
		assertEquals("Lynwood", customers.get(688).getFirstName());
	}

	@Test
	@DisplayName("Record 689: LastName is Gruba")
	void LastNameOfRecord689() {
		assertEquals("Gruba", customers.get(688).getLastName());
	}

	@Test
	@DisplayName("Record 689: Company is Kee & Associates")
	void CompanyOfRecord689() {
		assertEquals("Kee & Associates", customers.get(688).getCompany());
	}

	@Test
	@DisplayName("Record 689: Address is 411 W Exchange St")
	void AddressOfRecord689() {
		assertEquals("411 W Exchange St", customers.get(688).getAddress());
	}

	@Test
	@DisplayName("Record 689: City is Akron")
	void CityOfRecord689() {
		assertEquals("Akron", customers.get(688).getCity());
	}

	@Test
	@DisplayName("Record 689: County is Summit")
	void CountyOfRecord689() {
		assertEquals("Summit", customers.get(688).getCounty());
	}

	@Test
	@DisplayName("Record 689: State is OH")
	void StateOfRecord689() {
		assertEquals("OH", customers.get(688).getState());
	}

	@Test
	@DisplayName("Record 689: ZIP is 44302")
	void ZIPOfRecord689() {
		assertEquals("44302", customers.get(688).getZIP());
	}

	@Test
	@DisplayName("Record 689: Phone is 330-762-6545")
	void PhoneOfRecord689() {
		assertEquals("330-762-6545", customers.get(688).getPhone());
	}

	@Test
	@DisplayName("Record 689: Fax is 330-762-3841")
	void FaxOfRecord689() {
		assertEquals("330-762-3841", customers.get(688).getFax());
	}

	@Test
	@DisplayName("Record 689: Email is lynwood@gruba.com")
	void EmailOfRecord689() {
		assertEquals("lynwood@gruba.com", customers.get(688).getEmail());
	}

	@Test
	@DisplayName("Record 689: Web is http://www.lynwoodgruba.com")
	void WebOfRecord689() {
		assertEquals("http://www.lynwoodgruba.com", customers.get(688).getWeb());
	}
}
