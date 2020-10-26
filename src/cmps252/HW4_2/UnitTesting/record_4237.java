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

@Tag("35")
class Record_4237 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4237: FirstName is Alissa")
	void FirstNameOfRecord4237() {
		assertEquals("Alissa", customers.get(4236).getFirstName());
	}

	@Test
	@DisplayName("Record 4237: LastName is Salters")
	void LastNameOfRecord4237() {
		assertEquals("Salters", customers.get(4236).getLastName());
	}

	@Test
	@DisplayName("Record 4237: Company is Haar, Laurence M")
	void CompanyOfRecord4237() {
		assertEquals("Haar, Laurence M", customers.get(4236).getCompany());
	}

	@Test
	@DisplayName("Record 4237: Address is 888 Executive Center Dr  #-300")
	void AddressOfRecord4237() {
		assertEquals("888 Executive Center Dr  #-300", customers.get(4236).getAddress());
	}

	@Test
	@DisplayName("Record 4237: City is Saint Petersburg")
	void CityOfRecord4237() {
		assertEquals("Saint Petersburg", customers.get(4236).getCity());
	}

	@Test
	@DisplayName("Record 4237: County is Pinellas")
	void CountyOfRecord4237() {
		assertEquals("Pinellas", customers.get(4236).getCounty());
	}

	@Test
	@DisplayName("Record 4237: State is FL")
	void StateOfRecord4237() {
		assertEquals("FL", customers.get(4236).getState());
	}

	@Test
	@DisplayName("Record 4237: ZIP is 33702")
	void ZIPOfRecord4237() {
		assertEquals("33702", customers.get(4236).getZIP());
	}

	@Test
	@DisplayName("Record 4237: Phone is 727-578-5159")
	void PhoneOfRecord4237() {
		assertEquals("727-578-5159", customers.get(4236).getPhone());
	}

	@Test
	@DisplayName("Record 4237: Fax is 727-578-9538")
	void FaxOfRecord4237() {
		assertEquals("727-578-9538", customers.get(4236).getFax());
	}

	@Test
	@DisplayName("Record 4237: Email is alissa@salters.com")
	void EmailOfRecord4237() {
		assertEquals("alissa@salters.com", customers.get(4236).getEmail());
	}

	@Test
	@DisplayName("Record 4237: Web is http://www.alissasalters.com")
	void WebOfRecord4237() {
		assertEquals("http://www.alissasalters.com", customers.get(4236).getWeb());
	}
}
