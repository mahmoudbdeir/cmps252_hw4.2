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

@Tag("8")
class Record_148 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 148: FirstName is Jannie")
	void FirstNameOfRecord148() {
		assertEquals("Jannie", customers.get(147).getFirstName());
	}

	@Test
	@DisplayName("Record 148: LastName is Forss")
	void LastNameOfRecord148() {
		assertEquals("Forss", customers.get(147).getLastName());
	}

	@Test
	@DisplayName("Record 148: Company is Niewyk, Anthony Esq")
	void CompanyOfRecord148() {
		assertEquals("Niewyk, Anthony Esq", customers.get(147).getCompany());
	}

	@Test
	@DisplayName("Record 148: Address is 2810 E 3rd Ave")
	void AddressOfRecord148() {
		assertEquals("2810 E 3rd Ave", customers.get(147).getAddress());
	}

	@Test
	@DisplayName("Record 148: City is Amarillo")
	void CityOfRecord148() {
		assertEquals("Amarillo", customers.get(147).getCity());
	}

	@Test
	@DisplayName("Record 148: County is Potter")
	void CountyOfRecord148() {
		assertEquals("Potter", customers.get(147).getCounty());
	}

	@Test
	@DisplayName("Record 148: State is TX")
	void StateOfRecord148() {
		assertEquals("TX", customers.get(147).getState());
	}

	@Test
	@DisplayName("Record 148: ZIP is 79104")
	void ZIPOfRecord148() {
		assertEquals("79104", customers.get(147).getZIP());
	}

	@Test
	@DisplayName("Record 148: Phone is 806-376-7038")
	void PhoneOfRecord148() {
		assertEquals("806-376-7038", customers.get(147).getPhone());
	}

	@Test
	@DisplayName("Record 148: Fax is 806-376-3553")
	void FaxOfRecord148() {
		assertEquals("806-376-3553", customers.get(147).getFax());
	}

	@Test
	@DisplayName("Record 148: Email is jannie@forss.com")
	void EmailOfRecord148() {
		assertEquals("jannie@forss.com", customers.get(147).getEmail());
	}

	@Test
	@DisplayName("Record 148: Web is http://www.jannieforss.com")
	void WebOfRecord148() {
		assertEquals("http://www.jannieforss.com", customers.get(147).getWeb());
	}
}
