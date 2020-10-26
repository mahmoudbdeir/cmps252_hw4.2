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

@Tag("47")
class Record_1242 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1242: FirstName is Gene")
	void FirstNameOfRecord1242() {
		assertEquals("Gene", customers.get(1241).getFirstName());
	}

	@Test
	@DisplayName("Record 1242: LastName is Gendel")
	void LastNameOfRecord1242() {
		assertEquals("Gendel", customers.get(1241).getLastName());
	}

	@Test
	@DisplayName("Record 1242: Company is Fairbanks Community Food Bank")
	void CompanyOfRecord1242() {
		assertEquals("Fairbanks Community Food Bank", customers.get(1241).getCompany());
	}

	@Test
	@DisplayName("Record 1242: Address is 335 N Monroe")
	void AddressOfRecord1242() {
		assertEquals("335 N Monroe", customers.get(1241).getAddress());
	}

	@Test
	@DisplayName("Record 1242: City is Tallahassee")
	void CityOfRecord1242() {
		assertEquals("Tallahassee", customers.get(1241).getCity());
	}

	@Test
	@DisplayName("Record 1242: County is Leon")
	void CountyOfRecord1242() {
		assertEquals("Leon", customers.get(1241).getCounty());
	}

	@Test
	@DisplayName("Record 1242: State is FL")
	void StateOfRecord1242() {
		assertEquals("FL", customers.get(1241).getState());
	}

	@Test
	@DisplayName("Record 1242: ZIP is 32301")
	void ZIPOfRecord1242() {
		assertEquals("32301", customers.get(1241).getZIP());
	}

	@Test
	@DisplayName("Record 1242: Phone is 850-222-0769")
	void PhoneOfRecord1242() {
		assertEquals("850-222-0769", customers.get(1241).getPhone());
	}

	@Test
	@DisplayName("Record 1242: Fax is 850-222-5013")
	void FaxOfRecord1242() {
		assertEquals("850-222-5013", customers.get(1241).getFax());
	}

	@Test
	@DisplayName("Record 1242: Email is gene@gendel.com")
	void EmailOfRecord1242() {
		assertEquals("gene@gendel.com", customers.get(1241).getEmail());
	}

	@Test
	@DisplayName("Record 1242: Web is http://www.genegendel.com")
	void WebOfRecord1242() {
		assertEquals("http://www.genegendel.com", customers.get(1241).getWeb());
	}
}
