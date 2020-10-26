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

@Tag("39")
class Record_364 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 364: FirstName is Mauricio")
	void FirstNameOfRecord364() {
		assertEquals("Mauricio", customers.get(363).getFirstName());
	}

	@Test
	@DisplayName("Record 364: LastName is Schrage")
	void LastNameOfRecord364() {
		assertEquals("Schrage", customers.get(363).getLastName());
	}

	@Test
	@DisplayName("Record 364: Company is Fiser, Harvey L Esq")
	void CompanyOfRecord364() {
		assertEquals("Fiser, Harvey L Esq", customers.get(363).getCompany());
	}

	@Test
	@DisplayName("Record 364: Address is 680 Lisbon St")
	void AddressOfRecord364() {
		assertEquals("680 Lisbon St", customers.get(363).getAddress());
	}

	@Test
	@DisplayName("Record 364: City is Lewiston")
	void CityOfRecord364() {
		assertEquals("Lewiston", customers.get(363).getCity());
	}

	@Test
	@DisplayName("Record 364: County is Androscoggin")
	void CountyOfRecord364() {
		assertEquals("Androscoggin", customers.get(363).getCounty());
	}

	@Test
	@DisplayName("Record 364: State is ME")
	void StateOfRecord364() {
		assertEquals("ME", customers.get(363).getState());
	}

	@Test
	@DisplayName("Record 364: ZIP is 4240")
	void ZIPOfRecord364() {
		assertEquals("4240", customers.get(363).getZIP());
	}

	@Test
	@DisplayName("Record 364: Phone is 207-786-4453")
	void PhoneOfRecord364() {
		assertEquals("207-786-4453", customers.get(363).getPhone());
	}

	@Test
	@DisplayName("Record 364: Fax is 207-786-6359")
	void FaxOfRecord364() {
		assertEquals("207-786-6359", customers.get(363).getFax());
	}

	@Test
	@DisplayName("Record 364: Email is mauricio@schrage.com")
	void EmailOfRecord364() {
		assertEquals("mauricio@schrage.com", customers.get(363).getEmail());
	}

	@Test
	@DisplayName("Record 364: Web is http://www.mauricioschrage.com")
	void WebOfRecord364() {
		assertEquals("http://www.mauricioschrage.com", customers.get(363).getWeb());
	}
}
