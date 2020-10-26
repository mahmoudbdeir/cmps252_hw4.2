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

@Tag("20")
class Record_322 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 322: FirstName is Rupert")
	void FirstNameOfRecord322() {
		assertEquals("Rupert", customers.get(321).getFirstName());
	}

	@Test
	@DisplayName("Record 322: LastName is Garski")
	void LastNameOfRecord322() {
		assertEquals("Garski", customers.get(321).getLastName());
	}

	@Test
	@DisplayName("Record 322: Company is Schuylkill County Board Rltrs")
	void CompanyOfRecord322() {
		assertEquals("Schuylkill County Board Rltrs", customers.get(321).getCompany());
	}

	@Test
	@DisplayName("Record 322: Address is 2726 Gunnison St")
	void AddressOfRecord322() {
		assertEquals("2726 Gunnison St", customers.get(321).getAddress());
	}

	@Test
	@DisplayName("Record 322: City is Colorado Springs")
	void CityOfRecord322() {
		assertEquals("Colorado Springs", customers.get(321).getCity());
	}

	@Test
	@DisplayName("Record 322: County is El Paso")
	void CountyOfRecord322() {
		assertEquals("El Paso", customers.get(321).getCounty());
	}

	@Test
	@DisplayName("Record 322: State is CO")
	void StateOfRecord322() {
		assertEquals("CO", customers.get(321).getState());
	}

	@Test
	@DisplayName("Record 322: ZIP is 80909")
	void ZIPOfRecord322() {
		assertEquals("80909", customers.get(321).getZIP());
	}

	@Test
	@DisplayName("Record 322: Phone is 719-634-0965")
	void PhoneOfRecord322() {
		assertEquals("719-634-0965", customers.get(321).getPhone());
	}

	@Test
	@DisplayName("Record 322: Fax is 719-634-5473")
	void FaxOfRecord322() {
		assertEquals("719-634-5473", customers.get(321).getFax());
	}

	@Test
	@DisplayName("Record 322: Email is rupert@garski.com")
	void EmailOfRecord322() {
		assertEquals("rupert@garski.com", customers.get(321).getEmail());
	}

	@Test
	@DisplayName("Record 322: Web is http://www.rupertgarski.com")
	void WebOfRecord322() {
		assertEquals("http://www.rupertgarski.com", customers.get(321).getWeb());
	}
}
