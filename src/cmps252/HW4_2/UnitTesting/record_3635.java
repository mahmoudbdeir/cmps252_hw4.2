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
class Record_3635 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3635: FirstName is Neva")
	void FirstNameOfRecord3635() {
		assertEquals("Neva", customers.get(3634).getFirstName());
	}

	@Test
	@DisplayName("Record 3635: LastName is Berlinghof")
	void LastNameOfRecord3635() {
		assertEquals("Berlinghof", customers.get(3634).getLastName());
	}

	@Test
	@DisplayName("Record 3635: Company is Tri Jay Co")
	void CompanyOfRecord3635() {
		assertEquals("Tri Jay Co", customers.get(3634).getCompany());
	}

	@Test
	@DisplayName("Record 3635: Address is Greece Ridge Center")
	void AddressOfRecord3635() {
		assertEquals("Greece Ridge Center", customers.get(3634).getAddress());
	}

	@Test
	@DisplayName("Record 3635: City is Rochester")
	void CityOfRecord3635() {
		assertEquals("Rochester", customers.get(3634).getCity());
	}

	@Test
	@DisplayName("Record 3635: County is Monroe")
	void CountyOfRecord3635() {
		assertEquals("Monroe", customers.get(3634).getCounty());
	}

	@Test
	@DisplayName("Record 3635: State is NY")
	void StateOfRecord3635() {
		assertEquals("NY", customers.get(3634).getState());
	}

	@Test
	@DisplayName("Record 3635: ZIP is 14626")
	void ZIPOfRecord3635() {
		assertEquals("14626", customers.get(3634).getZIP());
	}

	@Test
	@DisplayName("Record 3635: Phone is 585-865-8143")
	void PhoneOfRecord3635() {
		assertEquals("585-865-8143", customers.get(3634).getPhone());
	}

	@Test
	@DisplayName("Record 3635: Fax is 585-865-2232")
	void FaxOfRecord3635() {
		assertEquals("585-865-2232", customers.get(3634).getFax());
	}

	@Test
	@DisplayName("Record 3635: Email is neva@berlinghof.com")
	void EmailOfRecord3635() {
		assertEquals("neva@berlinghof.com", customers.get(3634).getEmail());
	}

	@Test
	@DisplayName("Record 3635: Web is http://www.nevaberlinghof.com")
	void WebOfRecord3635() {
		assertEquals("http://www.nevaberlinghof.com", customers.get(3634).getWeb());
	}
}
