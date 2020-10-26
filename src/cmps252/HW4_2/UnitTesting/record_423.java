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

@Tag("18")
class Record_423 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 423: FirstName is Velma")
	void FirstNameOfRecord423() {
		assertEquals("Velma", customers.get(422).getFirstName());
	}

	@Test
	@DisplayName("Record 423: LastName is Burian")
	void LastNameOfRecord423() {
		assertEquals("Burian", customers.get(422).getLastName());
	}

	@Test
	@DisplayName("Record 423: Company is Mccready, Kevin J Esq")
	void CompanyOfRecord423() {
		assertEquals("Mccready, Kevin J Esq", customers.get(422).getCompany());
	}

	@Test
	@DisplayName("Record 423: Address is 819 Edwards Rd")
	void AddressOfRecord423() {
		assertEquals("819 Edwards Rd", customers.get(422).getAddress());
	}

	@Test
	@DisplayName("Record 423: City is Parsippany")
	void CityOfRecord423() {
		assertEquals("Parsippany", customers.get(422).getCity());
	}

	@Test
	@DisplayName("Record 423: County is Morris")
	void CountyOfRecord423() {
		assertEquals("Morris", customers.get(422).getCounty());
	}

	@Test
	@DisplayName("Record 423: State is NJ")
	void StateOfRecord423() {
		assertEquals("NJ", customers.get(422).getState());
	}

	@Test
	@DisplayName("Record 423: ZIP is 7054")
	void ZIPOfRecord423() {
		assertEquals("7054", customers.get(422).getZIP());
	}

	@Test
	@DisplayName("Record 423: Phone is 973-575-9672")
	void PhoneOfRecord423() {
		assertEquals("973-575-9672", customers.get(422).getPhone());
	}

	@Test
	@DisplayName("Record 423: Fax is 973-575-3106")
	void FaxOfRecord423() {
		assertEquals("973-575-3106", customers.get(422).getFax());
	}

	@Test
	@DisplayName("Record 423: Email is velma@burian.com")
	void EmailOfRecord423() {
		assertEquals("velma@burian.com", customers.get(422).getEmail());
	}

	@Test
	@DisplayName("Record 423: Web is http://www.velmaburian.com")
	void WebOfRecord423() {
		assertEquals("http://www.velmaburian.com", customers.get(422).getWeb());
	}
}
