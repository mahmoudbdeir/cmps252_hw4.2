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
class Record_4542 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4542: FirstName is Jude")
	void FirstNameOfRecord4542() {
		assertEquals("Jude", customers.get(4541).getFirstName());
	}

	@Test
	@DisplayName("Record 4542: LastName is Redmer")
	void LastNameOfRecord4542() {
		assertEquals("Redmer", customers.get(4541).getLastName());
	}

	@Test
	@DisplayName("Record 4542: Company is Jan Hagara Collectors Club")
	void CompanyOfRecord4542() {
		assertEquals("Jan Hagara Collectors Club", customers.get(4541).getCompany());
	}

	@Test
	@DisplayName("Record 4542: Address is 1505 Commonwealth Ave")
	void AddressOfRecord4542() {
		assertEquals("1505 Commonwealth Ave", customers.get(4541).getAddress());
	}

	@Test
	@DisplayName("Record 4542: City is Brighton")
	void CityOfRecord4542() {
		assertEquals("Brighton", customers.get(4541).getCity());
	}

	@Test
	@DisplayName("Record 4542: County is Suffolk")
	void CountyOfRecord4542() {
		assertEquals("Suffolk", customers.get(4541).getCounty());
	}

	@Test
	@DisplayName("Record 4542: State is MA")
	void StateOfRecord4542() {
		assertEquals("MA", customers.get(4541).getState());
	}

	@Test
	@DisplayName("Record 4542: ZIP is 2135")
	void ZIPOfRecord4542() {
		assertEquals("2135", customers.get(4541).getZIP());
	}

	@Test
	@DisplayName("Record 4542: Phone is 617-782-5152")
	void PhoneOfRecord4542() {
		assertEquals("617-782-5152", customers.get(4541).getPhone());
	}

	@Test
	@DisplayName("Record 4542: Fax is 617-782-9817")
	void FaxOfRecord4542() {
		assertEquals("617-782-9817", customers.get(4541).getFax());
	}

	@Test
	@DisplayName("Record 4542: Email is jude@redmer.com")
	void EmailOfRecord4542() {
		assertEquals("jude@redmer.com", customers.get(4541).getEmail());
	}

	@Test
	@DisplayName("Record 4542: Web is http://www.juderedmer.com")
	void WebOfRecord4542() {
		assertEquals("http://www.juderedmer.com", customers.get(4541).getWeb());
	}
}
