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
class Record_2635 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2635: FirstName is Emery")
	void FirstNameOfRecord2635() {
		assertEquals("Emery", customers.get(2634).getFirstName());
	}

	@Test
	@DisplayName("Record 2635: LastName is Marroquin")
	void LastNameOfRecord2635() {
		assertEquals("Marroquin", customers.get(2634).getLastName());
	}

	@Test
	@DisplayName("Record 2635: Company is Investigative Counsel Unltd")
	void CompanyOfRecord2635() {
		assertEquals("Investigative Counsel Unltd", customers.get(2634).getCompany());
	}

	@Test
	@DisplayName("Record 2635: Address is 2006 Stardust Ln")
	void AddressOfRecord2635() {
		assertEquals("2006 Stardust Ln", customers.get(2634).getAddress());
	}

	@Test
	@DisplayName("Record 2635: City is Corpus Christi")
	void CityOfRecord2635() {
		assertEquals("Corpus Christi", customers.get(2634).getCity());
	}

	@Test
	@DisplayName("Record 2635: County is Nueces")
	void CountyOfRecord2635() {
		assertEquals("Nueces", customers.get(2634).getCounty());
	}

	@Test
	@DisplayName("Record 2635: State is TX")
	void StateOfRecord2635() {
		assertEquals("TX", customers.get(2634).getState());
	}

	@Test
	@DisplayName("Record 2635: ZIP is 78418")
	void ZIPOfRecord2635() {
		assertEquals("78418", customers.get(2634).getZIP());
	}

	@Test
	@DisplayName("Record 2635: Phone is 361-939-1728")
	void PhoneOfRecord2635() {
		assertEquals("361-939-1728", customers.get(2634).getPhone());
	}

	@Test
	@DisplayName("Record 2635: Fax is 361-939-5471")
	void FaxOfRecord2635() {
		assertEquals("361-939-5471", customers.get(2634).getFax());
	}

	@Test
	@DisplayName("Record 2635: Email is emery@marroquin.com")
	void EmailOfRecord2635() {
		assertEquals("emery@marroquin.com", customers.get(2634).getEmail());
	}

	@Test
	@DisplayName("Record 2635: Web is http://www.emerymarroquin.com")
	void WebOfRecord2635() {
		assertEquals("http://www.emerymarroquin.com", customers.get(2634).getWeb());
	}
}
