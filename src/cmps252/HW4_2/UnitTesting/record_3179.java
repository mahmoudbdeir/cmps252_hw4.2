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
class Record_3179 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3179: FirstName is Merry")
	void FirstNameOfRecord3179() {
		assertEquals("Merry", customers.get(3178).getFirstName());
	}

	@Test
	@DisplayName("Record 3179: LastName is Valverde")
	void LastNameOfRecord3179() {
		assertEquals("Valverde", customers.get(3178).getLastName());
	}

	@Test
	@DisplayName("Record 3179: Company is Nemkov, Peter M Esq")
	void CompanyOfRecord3179() {
		assertEquals("Nemkov, Peter M Esq", customers.get(3178).getCompany());
	}

	@Test
	@DisplayName("Record 3179: Address is 8470 Tyco Rd  #-c")
	void AddressOfRecord3179() {
		assertEquals("8470 Tyco Rd  #-c", customers.get(3178).getAddress());
	}

	@Test
	@DisplayName("Record 3179: City is Vienna")
	void CityOfRecord3179() {
		assertEquals("Vienna", customers.get(3178).getCity());
	}

	@Test
	@DisplayName("Record 3179: County is Fairfax")
	void CountyOfRecord3179() {
		assertEquals("Fairfax", customers.get(3178).getCounty());
	}

	@Test
	@DisplayName("Record 3179: State is VA")
	void StateOfRecord3179() {
		assertEquals("VA", customers.get(3178).getState());
	}

	@Test
	@DisplayName("Record 3179: ZIP is 22182")
	void ZIPOfRecord3179() {
		assertEquals("22182", customers.get(3178).getZIP());
	}

	@Test
	@DisplayName("Record 3179: Phone is 703-893-1173")
	void PhoneOfRecord3179() {
		assertEquals("703-893-1173", customers.get(3178).getPhone());
	}

	@Test
	@DisplayName("Record 3179: Fax is 703-893-8812")
	void FaxOfRecord3179() {
		assertEquals("703-893-8812", customers.get(3178).getFax());
	}

	@Test
	@DisplayName("Record 3179: Email is merry@valverde.com")
	void EmailOfRecord3179() {
		assertEquals("merry@valverde.com", customers.get(3178).getEmail());
	}

	@Test
	@DisplayName("Record 3179: Web is http://www.merryvalverde.com")
	void WebOfRecord3179() {
		assertEquals("http://www.merryvalverde.com", customers.get(3178).getWeb());
	}
}
