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

@Tag("40")
class Record_232 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 232: FirstName is Vivian")
	void FirstNameOfRecord232() {
		assertEquals("Vivian", customers.get(231).getFirstName());
	}

	@Test
	@DisplayName("Record 232: LastName is Endicott")
	void LastNameOfRecord232() {
		assertEquals("Endicott", customers.get(231).getLastName());
	}

	@Test
	@DisplayName("Record 232: Company is Davis, Mark A Esq")
	void CompanyOfRecord232() {
		assertEquals("Davis, Mark A Esq", customers.get(231).getCompany());
	}

	@Test
	@DisplayName("Record 232: Address is 316 Via Del Norte")
	void AddressOfRecord232() {
		assertEquals("316 Via Del Norte", customers.get(231).getAddress());
	}

	@Test
	@DisplayName("Record 232: City is Oceanside")
	void CityOfRecord232() {
		assertEquals("Oceanside", customers.get(231).getCity());
	}

	@Test
	@DisplayName("Record 232: County is San Diego")
	void CountyOfRecord232() {
		assertEquals("San Diego", customers.get(231).getCounty());
	}

	@Test
	@DisplayName("Record 232: State is CA")
	void StateOfRecord232() {
		assertEquals("CA", customers.get(231).getState());
	}

	@Test
	@DisplayName("Record 232: ZIP is 92054")
	void ZIPOfRecord232() {
		assertEquals("92054", customers.get(231).getZIP());
	}

	@Test
	@DisplayName("Record 232: Phone is 760-757-0130")
	void PhoneOfRecord232() {
		assertEquals("760-757-0130", customers.get(231).getPhone());
	}

	@Test
	@DisplayName("Record 232: Fax is 760-757-7442")
	void FaxOfRecord232() {
		assertEquals("760-757-7442", customers.get(231).getFax());
	}

	@Test
	@DisplayName("Record 232: Email is vivian@endicott.com")
	void EmailOfRecord232() {
		assertEquals("vivian@endicott.com", customers.get(231).getEmail());
	}

	@Test
	@DisplayName("Record 232: Web is http://www.vivianendicott.com")
	void WebOfRecord232() {
		assertEquals("http://www.vivianendicott.com", customers.get(231).getWeb());
	}
}
