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

@Tag("17")
class Record_3860 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3860: FirstName is Gretchen")
	void FirstNameOfRecord3860() {
		assertEquals("Gretchen", customers.get(3859).getFirstName());
	}

	@Test
	@DisplayName("Record 3860: LastName is Diec")
	void LastNameOfRecord3860() {
		assertEquals("Diec", customers.get(3859).getLastName());
	}

	@Test
	@DisplayName("Record 3860: Company is Canning, Kevin J Esq")
	void CompanyOfRecord3860() {
		assertEquals("Canning, Kevin J Esq", customers.get(3859).getCompany());
	}

	@Test
	@DisplayName("Record 3860: Address is 156 Lincoln St")
	void AddressOfRecord3860() {
		assertEquals("156 Lincoln St", customers.get(3859).getAddress());
	}

	@Test
	@DisplayName("Record 3860: City is Brighton")
	void CityOfRecord3860() {
		assertEquals("Brighton", customers.get(3859).getCity());
	}

	@Test
	@DisplayName("Record 3860: County is Suffolk")
	void CountyOfRecord3860() {
		assertEquals("Suffolk", customers.get(3859).getCounty());
	}

	@Test
	@DisplayName("Record 3860: State is MA")
	void StateOfRecord3860() {
		assertEquals("MA", customers.get(3859).getState());
	}

	@Test
	@DisplayName("Record 3860: ZIP is 2135")
	void ZIPOfRecord3860() {
		assertEquals("2135", customers.get(3859).getZIP());
	}

	@Test
	@DisplayName("Record 3860: Phone is 617-789-0149")
	void PhoneOfRecord3860() {
		assertEquals("617-789-0149", customers.get(3859).getPhone());
	}

	@Test
	@DisplayName("Record 3860: Fax is 617-789-2799")
	void FaxOfRecord3860() {
		assertEquals("617-789-2799", customers.get(3859).getFax());
	}

	@Test
	@DisplayName("Record 3860: Email is gretchen@diec.com")
	void EmailOfRecord3860() {
		assertEquals("gretchen@diec.com", customers.get(3859).getEmail());
	}

	@Test
	@DisplayName("Record 3860: Web is http://www.gretchendiec.com")
	void WebOfRecord3860() {
		assertEquals("http://www.gretchendiec.com", customers.get(3859).getWeb());
	}
}
