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

@Tag("1")
class Record_2750 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2750: FirstName is Geneva")
	void FirstNameOfRecord2750() {
		assertEquals("Geneva", customers.get(2749).getFirstName());
	}

	@Test
	@DisplayName("Record 2750: LastName is Kull")
	void LastNameOfRecord2750() {
		assertEquals("Kull", customers.get(2749).getLastName());
	}

	@Test
	@DisplayName("Record 2750: Company is Tallon, Deborah L Esq")
	void CompanyOfRecord2750() {
		assertEquals("Tallon, Deborah L Esq", customers.get(2749).getCompany());
	}

	@Test
	@DisplayName("Record 2750: Address is 199 Hayward St")
	void AddressOfRecord2750() {
		assertEquals("199 Hayward St", customers.get(2749).getAddress());
	}

	@Test
	@DisplayName("Record 2750: City is Manchester")
	void CityOfRecord2750() {
		assertEquals("Manchester", customers.get(2749).getCity());
	}

	@Test
	@DisplayName("Record 2750: County is Hillsborough")
	void CountyOfRecord2750() {
		assertEquals("Hillsborough", customers.get(2749).getCounty());
	}

	@Test
	@DisplayName("Record 2750: State is NH")
	void StateOfRecord2750() {
		assertEquals("NH", customers.get(2749).getState());
	}

	@Test
	@DisplayName("Record 2750: ZIP is 3103")
	void ZIPOfRecord2750() {
		assertEquals("3103", customers.get(2749).getZIP());
	}

	@Test
	@DisplayName("Record 2750: Phone is 603-626-7327")
	void PhoneOfRecord2750() {
		assertEquals("603-626-7327", customers.get(2749).getPhone());
	}

	@Test
	@DisplayName("Record 2750: Fax is 603-626-7692")
	void FaxOfRecord2750() {
		assertEquals("603-626-7692", customers.get(2749).getFax());
	}

	@Test
	@DisplayName("Record 2750: Email is geneva@kull.com")
	void EmailOfRecord2750() {
		assertEquals("geneva@kull.com", customers.get(2749).getEmail());
	}

	@Test
	@DisplayName("Record 2750: Web is http://www.genevakull.com")
	void WebOfRecord2750() {
		assertEquals("http://www.genevakull.com", customers.get(2749).getWeb());
	}
}
