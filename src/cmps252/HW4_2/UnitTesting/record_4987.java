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

@Tag("33")
class Record_4987 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4987: FirstName is Beverly")
	void FirstNameOfRecord4987() {
		assertEquals("Beverly", customers.get(4986).getFirstName());
	}

	@Test
	@DisplayName("Record 4987: LastName is Radde")
	void LastNameOfRecord4987() {
		assertEquals("Radde", customers.get(4986).getLastName());
	}

	@Test
	@DisplayName("Record 4987: Company is Rita Blanca Elec Co Op Inc")
	void CompanyOfRecord4987() {
		assertEquals("Rita Blanca Elec Co Op Inc", customers.get(4986).getCompany());
	}

	@Test
	@DisplayName("Record 4987: Address is 815 Park Blvd  #-305")
	void AddressOfRecord4987() {
		assertEquals("815 Park Blvd  #-305", customers.get(4986).getAddress());
	}

	@Test
	@DisplayName("Record 4987: City is Boise")
	void CityOfRecord4987() {
		assertEquals("Boise", customers.get(4986).getCity());
	}

	@Test
	@DisplayName("Record 4987: County is Ada")
	void CountyOfRecord4987() {
		assertEquals("Ada", customers.get(4986).getCounty());
	}

	@Test
	@DisplayName("Record 4987: State is ID")
	void StateOfRecord4987() {
		assertEquals("ID", customers.get(4986).getState());
	}

	@Test
	@DisplayName("Record 4987: ZIP is 83712")
	void ZIPOfRecord4987() {
		assertEquals("83712", customers.get(4986).getZIP());
	}

	@Test
	@DisplayName("Record 4987: Phone is 208-343-6054")
	void PhoneOfRecord4987() {
		assertEquals("208-343-6054", customers.get(4986).getPhone());
	}

	@Test
	@DisplayName("Record 4987: Fax is 208-343-3908")
	void FaxOfRecord4987() {
		assertEquals("208-343-3908", customers.get(4986).getFax());
	}

	@Test
	@DisplayName("Record 4987: Email is beverly@radde.com")
	void EmailOfRecord4987() {
		assertEquals("beverly@radde.com", customers.get(4986).getEmail());
	}

	@Test
	@DisplayName("Record 4987: Web is http://www.beverlyradde.com")
	void WebOfRecord4987() {
		assertEquals("http://www.beverlyradde.com", customers.get(4986).getWeb());
	}
}
