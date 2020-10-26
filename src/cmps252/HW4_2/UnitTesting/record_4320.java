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

@Tag("22")
class Record_4320 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4320: FirstName is Millie")
	void FirstNameOfRecord4320() {
		assertEquals("Millie", customers.get(4319).getFirstName());
	}

	@Test
	@DisplayName("Record 4320: LastName is Noggles")
	void LastNameOfRecord4320() {
		assertEquals("Noggles", customers.get(4319).getLastName());
	}

	@Test
	@DisplayName("Record 4320: Company is Doerr & Knudson Pa")
	void CompanyOfRecord4320() {
		assertEquals("Doerr & Knudson Pa", customers.get(4319).getCompany());
	}

	@Test
	@DisplayName("Record 4320: Address is 11 Harristown Rd")
	void AddressOfRecord4320() {
		assertEquals("11 Harristown Rd", customers.get(4319).getAddress());
	}

	@Test
	@DisplayName("Record 4320: City is Glen Rock")
	void CityOfRecord4320() {
		assertEquals("Glen Rock", customers.get(4319).getCity());
	}

	@Test
	@DisplayName("Record 4320: County is Bergen")
	void CountyOfRecord4320() {
		assertEquals("Bergen", customers.get(4319).getCounty());
	}

	@Test
	@DisplayName("Record 4320: State is NJ")
	void StateOfRecord4320() {
		assertEquals("NJ", customers.get(4319).getState());
	}

	@Test
	@DisplayName("Record 4320: ZIP is 7452")
	void ZIPOfRecord4320() {
		assertEquals("7452", customers.get(4319).getZIP());
	}

	@Test
	@DisplayName("Record 4320: Phone is 201-447-9407")
	void PhoneOfRecord4320() {
		assertEquals("201-447-9407", customers.get(4319).getPhone());
	}

	@Test
	@DisplayName("Record 4320: Fax is 201-447-2913")
	void FaxOfRecord4320() {
		assertEquals("201-447-2913", customers.get(4319).getFax());
	}

	@Test
	@DisplayName("Record 4320: Email is millie@noggles.com")
	void EmailOfRecord4320() {
		assertEquals("millie@noggles.com", customers.get(4319).getEmail());
	}

	@Test
	@DisplayName("Record 4320: Web is http://www.millienoggles.com")
	void WebOfRecord4320() {
		assertEquals("http://www.millienoggles.com", customers.get(4319).getWeb());
	}
}
