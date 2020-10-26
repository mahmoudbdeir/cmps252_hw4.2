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

@Tag("24")
class Record_4613 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4613: FirstName is Rebeca")
	void FirstNameOfRecord4613() {
		assertEquals("Rebeca", customers.get(4612).getFirstName());
	}

	@Test
	@DisplayName("Record 4613: LastName is Carlsson")
	void LastNameOfRecord4613() {
		assertEquals("Carlsson", customers.get(4612).getLastName());
	}

	@Test
	@DisplayName("Record 4613: Company is Sandbote, Louis J Esq")
	void CompanyOfRecord4613() {
		assertEquals("Sandbote, Louis J Esq", customers.get(4612).getCompany());
	}

	@Test
	@DisplayName("Record 4613: Address is 125 Academy St")
	void AddressOfRecord4613() {
		assertEquals("125 Academy St", customers.get(4612).getAddress());
	}

	@Test
	@DisplayName("Record 4613: City is Presque Isle")
	void CityOfRecord4613() {
		assertEquals("Presque Isle", customers.get(4612).getCity());
	}

	@Test
	@DisplayName("Record 4613: County is Aroostook")
	void CountyOfRecord4613() {
		assertEquals("Aroostook", customers.get(4612).getCounty());
	}

	@Test
	@DisplayName("Record 4613: State is ME")
	void StateOfRecord4613() {
		assertEquals("ME", customers.get(4612).getState());
	}

	@Test
	@DisplayName("Record 4613: ZIP is 04769")
	void ZIPOfRecord4613() {
		assertEquals("04769", customers.get(4612).getZIP());
	}

	@Test
	@DisplayName("Record 4613: Phone is 207-764-8289")
	void PhoneOfRecord4613() {
		assertEquals("207-764-8289", customers.get(4612).getPhone());
	}

	@Test
	@DisplayName("Record 4613: Fax is 207-764-7392")
	void FaxOfRecord4613() {
		assertEquals("207-764-7392", customers.get(4612).getFax());
	}

	@Test
	@DisplayName("Record 4613: Email is rebeca@carlsson.com")
	void EmailOfRecord4613() {
		assertEquals("rebeca@carlsson.com", customers.get(4612).getEmail());
	}

	@Test
	@DisplayName("Record 4613: Web is http://www.rebecacarlsson.com")
	void WebOfRecord4613() {
		assertEquals("http://www.rebecacarlsson.com", customers.get(4612).getWeb());
	}
}
