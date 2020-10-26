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

@Tag("41")
class Record_4678 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4678: FirstName is Dionne")
	void FirstNameOfRecord4678() {
		assertEquals("Dionne", customers.get(4677).getFirstName());
	}

	@Test
	@DisplayName("Record 4678: LastName is Bramall")
	void LastNameOfRecord4678() {
		assertEquals("Bramall", customers.get(4677).getLastName());
	}

	@Test
	@DisplayName("Record 4678: Company is Hebert, Michael C Esq")
	void CompanyOfRecord4678() {
		assertEquals("Hebert, Michael C Esq", customers.get(4677).getCompany());
	}

	@Test
	@DisplayName("Record 4678: Address is 3812 W Kilgore Ave")
	void AddressOfRecord4678() {
		assertEquals("3812 W Kilgore Ave", customers.get(4677).getAddress());
	}

	@Test
	@DisplayName("Record 4678: City is Muncie")
	void CityOfRecord4678() {
		assertEquals("Muncie", customers.get(4677).getCity());
	}

	@Test
	@DisplayName("Record 4678: County is Delaware")
	void CountyOfRecord4678() {
		assertEquals("Delaware", customers.get(4677).getCounty());
	}

	@Test
	@DisplayName("Record 4678: State is IN")
	void StateOfRecord4678() {
		assertEquals("IN", customers.get(4677).getState());
	}

	@Test
	@DisplayName("Record 4678: ZIP is 47304")
	void ZIPOfRecord4678() {
		assertEquals("47304", customers.get(4677).getZIP());
	}

	@Test
	@DisplayName("Record 4678: Phone is 765-284-9410")
	void PhoneOfRecord4678() {
		assertEquals("765-284-9410", customers.get(4677).getPhone());
	}

	@Test
	@DisplayName("Record 4678: Fax is 765-284-4122")
	void FaxOfRecord4678() {
		assertEquals("765-284-4122", customers.get(4677).getFax());
	}

	@Test
	@DisplayName("Record 4678: Email is dionne@bramall.com")
	void EmailOfRecord4678() {
		assertEquals("dionne@bramall.com", customers.get(4677).getEmail());
	}

	@Test
	@DisplayName("Record 4678: Web is http://www.dionnebramall.com")
	void WebOfRecord4678() {
		assertEquals("http://www.dionnebramall.com", customers.get(4677).getWeb());
	}
}
