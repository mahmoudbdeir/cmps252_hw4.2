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

@Tag("0")
class Record_3121 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3121: FirstName is Theresa")
	void FirstNameOfRecord3121() {
		assertEquals("Theresa", customers.get(3120).getFirstName());
	}

	@Test
	@DisplayName("Record 3121: LastName is Revier")
	void LastNameOfRecord3121() {
		assertEquals("Revier", customers.get(3120).getLastName());
	}

	@Test
	@DisplayName("Record 3121: Company is Ritchey, Michael L Esq")
	void CompanyOfRecord3121() {
		assertEquals("Ritchey, Michael L Esq", customers.get(3120).getCompany());
	}

	@Test
	@DisplayName("Record 3121: Address is 6936 Beach Blvd")
	void AddressOfRecord3121() {
		assertEquals("6936 Beach Blvd", customers.get(3120).getAddress());
	}

	@Test
	@DisplayName("Record 3121: City is Jacksonville")
	void CityOfRecord3121() {
		assertEquals("Jacksonville", customers.get(3120).getCity());
	}

	@Test
	@DisplayName("Record 3121: County is Duval")
	void CountyOfRecord3121() {
		assertEquals("Duval", customers.get(3120).getCounty());
	}

	@Test
	@DisplayName("Record 3121: State is FL")
	void StateOfRecord3121() {
		assertEquals("FL", customers.get(3120).getState());
	}

	@Test
	@DisplayName("Record 3121: ZIP is 32216")
	void ZIPOfRecord3121() {
		assertEquals("32216", customers.get(3120).getZIP());
	}

	@Test
	@DisplayName("Record 3121: Phone is 904-725-2900")
	void PhoneOfRecord3121() {
		assertEquals("904-725-2900", customers.get(3120).getPhone());
	}

	@Test
	@DisplayName("Record 3121: Fax is 904-725-9746")
	void FaxOfRecord3121() {
		assertEquals("904-725-9746", customers.get(3120).getFax());
	}

	@Test
	@DisplayName("Record 3121: Email is theresa@revier.com")
	void EmailOfRecord3121() {
		assertEquals("theresa@revier.com", customers.get(3120).getEmail());
	}

	@Test
	@DisplayName("Record 3121: Web is http://www.theresarevier.com")
	void WebOfRecord3121() {
		assertEquals("http://www.theresarevier.com", customers.get(3120).getWeb());
	}
}
