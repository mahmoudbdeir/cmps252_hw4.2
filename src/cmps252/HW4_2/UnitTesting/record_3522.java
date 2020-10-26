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

@Tag("32")
class Record_3522 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3522: FirstName is Esmeralda")
	void FirstNameOfRecord3522() {
		assertEquals("Esmeralda", customers.get(3521).getFirstName());
	}

	@Test
	@DisplayName("Record 3522: LastName is Golida")
	void LastNameOfRecord3522() {
		assertEquals("Golida", customers.get(3521).getLastName());
	}

	@Test
	@DisplayName("Record 3522: Company is Jeffers, Nicole B Esq")
	void CompanyOfRecord3522() {
		assertEquals("Jeffers, Nicole B Esq", customers.get(3521).getCompany());
	}

	@Test
	@DisplayName("Record 3522: Address is 4588 W Shaw Ave")
	void AddressOfRecord3522() {
		assertEquals("4588 W Shaw Ave", customers.get(3521).getAddress());
	}

	@Test
	@DisplayName("Record 3522: City is Fresno")
	void CityOfRecord3522() {
		assertEquals("Fresno", customers.get(3521).getCity());
	}

	@Test
	@DisplayName("Record 3522: County is Fresno")
	void CountyOfRecord3522() {
		assertEquals("Fresno", customers.get(3521).getCounty());
	}

	@Test
	@DisplayName("Record 3522: State is CA")
	void StateOfRecord3522() {
		assertEquals("CA", customers.get(3521).getState());
	}

	@Test
	@DisplayName("Record 3522: ZIP is 93722")
	void ZIPOfRecord3522() {
		assertEquals("93722", customers.get(3521).getZIP());
	}

	@Test
	@DisplayName("Record 3522: Phone is 559-275-3716")
	void PhoneOfRecord3522() {
		assertEquals("559-275-3716", customers.get(3521).getPhone());
	}

	@Test
	@DisplayName("Record 3522: Fax is 559-275-2987")
	void FaxOfRecord3522() {
		assertEquals("559-275-2987", customers.get(3521).getFax());
	}

	@Test
	@DisplayName("Record 3522: Email is esmeralda@golida.com")
	void EmailOfRecord3522() {
		assertEquals("esmeralda@golida.com", customers.get(3521).getEmail());
	}

	@Test
	@DisplayName("Record 3522: Web is http://www.esmeraldagolida.com")
	void WebOfRecord3522() {
		assertEquals("http://www.esmeraldagolida.com", customers.get(3521).getWeb());
	}
}
