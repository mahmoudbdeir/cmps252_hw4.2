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

@Tag("16")
class Record_2915 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2915: FirstName is Jamie")
	void FirstNameOfRecord2915() {
		assertEquals("Jamie", customers.get(2914).getFirstName());
	}

	@Test
	@DisplayName("Record 2915: LastName is Vandixon")
	void LastNameOfRecord2915() {
		assertEquals("Vandixon", customers.get(2914).getLastName());
	}

	@Test
	@DisplayName("Record 2915: Company is Moore, Vincent J Esq")
	void CompanyOfRecord2915() {
		assertEquals("Moore, Vincent J Esq", customers.get(2914).getCompany());
	}

	@Test
	@DisplayName("Record 2915: Address is 100 International Dr")
	void AddressOfRecord2915() {
		assertEquals("100 International Dr", customers.get(2914).getAddress());
	}

	@Test
	@DisplayName("Record 2915: City is Buffalo")
	void CityOfRecord2915() {
		assertEquals("Buffalo", customers.get(2914).getCity());
	}

	@Test
	@DisplayName("Record 2915: County is Erie")
	void CountyOfRecord2915() {
		assertEquals("Erie", customers.get(2914).getCounty());
	}

	@Test
	@DisplayName("Record 2915: State is NY")
	void StateOfRecord2915() {
		assertEquals("NY", customers.get(2914).getState());
	}

	@Test
	@DisplayName("Record 2915: ZIP is 14221")
	void ZIPOfRecord2915() {
		assertEquals("14221", customers.get(2914).getZIP());
	}

	@Test
	@DisplayName("Record 2915: Phone is 716-634-1248")
	void PhoneOfRecord2915() {
		assertEquals("716-634-1248", customers.get(2914).getPhone());
	}

	@Test
	@DisplayName("Record 2915: Fax is 716-634-9809")
	void FaxOfRecord2915() {
		assertEquals("716-634-9809", customers.get(2914).getFax());
	}

	@Test
	@DisplayName("Record 2915: Email is jamie@vandixon.com")
	void EmailOfRecord2915() {
		assertEquals("jamie@vandixon.com", customers.get(2914).getEmail());
	}

	@Test
	@DisplayName("Record 2915: Web is http://www.jamievandixon.com")
	void WebOfRecord2915() {
		assertEquals("http://www.jamievandixon.com", customers.get(2914).getWeb());
	}
}
