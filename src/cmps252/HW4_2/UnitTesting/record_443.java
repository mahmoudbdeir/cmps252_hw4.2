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

@Tag("28")
class Record_443 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 443: FirstName is Amos")
	void FirstNameOfRecord443() {
		assertEquals("Amos", customers.get(442).getFirstName());
	}

	@Test
	@DisplayName("Record 443: LastName is Unkn")
	void LastNameOfRecord443() {
		assertEquals("Unkn", customers.get(442).getLastName());
	}

	@Test
	@DisplayName("Record 443: Company is Dake, Stephen M Esq")
	void CompanyOfRecord443() {
		assertEquals("Dake, Stephen M Esq", customers.get(442).getCompany());
	}

	@Test
	@DisplayName("Record 443: Address is 21 Broadway")
	void AddressOfRecord443() {
		assertEquals("21 Broadway", customers.get(442).getAddress());
	}

	@Test
	@DisplayName("Record 443: City is Westwood")
	void CityOfRecord443() {
		assertEquals("Westwood", customers.get(442).getCity());
	}

	@Test
	@DisplayName("Record 443: County is Bergen")
	void CountyOfRecord443() {
		assertEquals("Bergen", customers.get(442).getCounty());
	}

	@Test
	@DisplayName("Record 443: State is NJ")
	void StateOfRecord443() {
		assertEquals("NJ", customers.get(442).getState());
	}

	@Test
	@DisplayName("Record 443: ZIP is 7675")
	void ZIPOfRecord443() {
		assertEquals("7675", customers.get(442).getZIP());
	}

	@Test
	@DisplayName("Record 443: Phone is 201-664-9904")
	void PhoneOfRecord443() {
		assertEquals("201-664-9904", customers.get(442).getPhone());
	}

	@Test
	@DisplayName("Record 443: Fax is 201-664-0746")
	void FaxOfRecord443() {
		assertEquals("201-664-0746", customers.get(442).getFax());
	}

	@Test
	@DisplayName("Record 443: Email is amos@unkn.com")
	void EmailOfRecord443() {
		assertEquals("amos@unkn.com", customers.get(442).getEmail());
	}

	@Test
	@DisplayName("Record 443: Web is http://www.amosunkn.com")
	void WebOfRecord443() {
		assertEquals("http://www.amosunkn.com", customers.get(442).getWeb());
	}
}
