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

@Tag("23")
class Record_4972 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4972: FirstName is Orval")
	void FirstNameOfRecord4972() {
		assertEquals("Orval", customers.get(4971).getFirstName());
	}

	@Test
	@DisplayName("Record 4972: LastName is Collis")
	void LastNameOfRecord4972() {
		assertEquals("Collis", customers.get(4971).getLastName());
	}

	@Test
	@DisplayName("Record 4972: Company is Union County Electric Co Op")
	void CompanyOfRecord4972() {
		assertEquals("Union County Electric Co Op", customers.get(4971).getCompany());
	}

	@Test
	@DisplayName("Record 4972: Address is 4210 W Vickery Blvd")
	void AddressOfRecord4972() {
		assertEquals("4210 W Vickery Blvd", customers.get(4971).getAddress());
	}

	@Test
	@DisplayName("Record 4972: City is Fort Worth")
	void CityOfRecord4972() {
		assertEquals("Fort Worth", customers.get(4971).getCity());
	}

	@Test
	@DisplayName("Record 4972: County is Tarrant")
	void CountyOfRecord4972() {
		assertEquals("Tarrant", customers.get(4971).getCounty());
	}

	@Test
	@DisplayName("Record 4972: State is TX")
	void StateOfRecord4972() {
		assertEquals("TX", customers.get(4971).getState());
	}

	@Test
	@DisplayName("Record 4972: ZIP is 76107")
	void ZIPOfRecord4972() {
		assertEquals("76107", customers.get(4971).getZIP());
	}

	@Test
	@DisplayName("Record 4972: Phone is 817-731-9512")
	void PhoneOfRecord4972() {
		assertEquals("817-731-9512", customers.get(4971).getPhone());
	}

	@Test
	@DisplayName("Record 4972: Fax is 817-731-4479")
	void FaxOfRecord4972() {
		assertEquals("817-731-4479", customers.get(4971).getFax());
	}

	@Test
	@DisplayName("Record 4972: Email is orval@collis.com")
	void EmailOfRecord4972() {
		assertEquals("orval@collis.com", customers.get(4971).getEmail());
	}

	@Test
	@DisplayName("Record 4972: Web is http://www.orvalcollis.com")
	void WebOfRecord4972() {
		assertEquals("http://www.orvalcollis.com", customers.get(4971).getWeb());
	}
}
