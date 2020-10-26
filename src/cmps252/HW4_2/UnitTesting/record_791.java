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

@Tag("14")
class Record_791 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 791: FirstName is Harry")
	void FirstNameOfRecord791() {
		assertEquals("Harry", customers.get(790).getFirstName());
	}

	@Test
	@DisplayName("Record 791: LastName is Catello")
	void LastNameOfRecord791() {
		assertEquals("Catello", customers.get(790).getLastName());
	}

	@Test
	@DisplayName("Record 791: Company is R J R Circuits Inc")
	void CompanyOfRecord791() {
		assertEquals("R J R Circuits Inc", customers.get(790).getCompany());
	}

	@Test
	@DisplayName("Record 791: Address is 1375 Franquette Ave")
	void AddressOfRecord791() {
		assertEquals("1375 Franquette Ave", customers.get(790).getAddress());
	}

	@Test
	@DisplayName("Record 791: City is Concord")
	void CityOfRecord791() {
		assertEquals("Concord", customers.get(790).getCity());
	}

	@Test
	@DisplayName("Record 791: County is Contra Costa")
	void CountyOfRecord791() {
		assertEquals("Contra Costa", customers.get(790).getCounty());
	}

	@Test
	@DisplayName("Record 791: State is CA")
	void StateOfRecord791() {
		assertEquals("CA", customers.get(790).getState());
	}

	@Test
	@DisplayName("Record 791: ZIP is 94520")
	void ZIPOfRecord791() {
		assertEquals("94520", customers.get(790).getZIP());
	}

	@Test
	@DisplayName("Record 791: Phone is 925-676-1356")
	void PhoneOfRecord791() {
		assertEquals("925-676-1356", customers.get(790).getPhone());
	}

	@Test
	@DisplayName("Record 791: Fax is 925-676-4209")
	void FaxOfRecord791() {
		assertEquals("925-676-4209", customers.get(790).getFax());
	}

	@Test
	@DisplayName("Record 791: Email is harry@catello.com")
	void EmailOfRecord791() {
		assertEquals("harry@catello.com", customers.get(790).getEmail());
	}

	@Test
	@DisplayName("Record 791: Web is http://www.harrycatello.com")
	void WebOfRecord791() {
		assertEquals("http://www.harrycatello.com", customers.get(790).getWeb());
	}
}
