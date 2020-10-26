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
class Record_2527 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2527: FirstName is Timothy")
	void FirstNameOfRecord2527() {
		assertEquals("Timothy", customers.get(2526).getFirstName());
	}

	@Test
	@DisplayName("Record 2527: LastName is Ahlbrecht")
	void LastNameOfRecord2527() {
		assertEquals("Ahlbrecht", customers.get(2526).getLastName());
	}

	@Test
	@DisplayName("Record 2527: Company is Builderway Of Gainesville")
	void CompanyOfRecord2527() {
		assertEquals("Builderway Of Gainesville", customers.get(2526).getCompany());
	}

	@Test
	@DisplayName("Record 2527: Address is 2626 Hylan Blvd")
	void AddressOfRecord2527() {
		assertEquals("2626 Hylan Blvd", customers.get(2526).getAddress());
	}

	@Test
	@DisplayName("Record 2527: City is Staten Island")
	void CityOfRecord2527() {
		assertEquals("Staten Island", customers.get(2526).getCity());
	}

	@Test
	@DisplayName("Record 2527: County is Richmond")
	void CountyOfRecord2527() {
		assertEquals("Richmond", customers.get(2526).getCounty());
	}

	@Test
	@DisplayName("Record 2527: State is NY")
	void StateOfRecord2527() {
		assertEquals("NY", customers.get(2526).getState());
	}

	@Test
	@DisplayName("Record 2527: ZIP is 10306")
	void ZIPOfRecord2527() {
		assertEquals("10306", customers.get(2526).getZIP());
	}

	@Test
	@DisplayName("Record 2527: Phone is 718-987-6869")
	void PhoneOfRecord2527() {
		assertEquals("718-987-6869", customers.get(2526).getPhone());
	}

	@Test
	@DisplayName("Record 2527: Fax is 718-987-8722")
	void FaxOfRecord2527() {
		assertEquals("718-987-8722", customers.get(2526).getFax());
	}

	@Test
	@DisplayName("Record 2527: Email is timothy@ahlbrecht.com")
	void EmailOfRecord2527() {
		assertEquals("timothy@ahlbrecht.com", customers.get(2526).getEmail());
	}

	@Test
	@DisplayName("Record 2527: Web is http://www.timothyahlbrecht.com")
	void WebOfRecord2527() {
		assertEquals("http://www.timothyahlbrecht.com", customers.get(2526).getWeb());
	}
}
