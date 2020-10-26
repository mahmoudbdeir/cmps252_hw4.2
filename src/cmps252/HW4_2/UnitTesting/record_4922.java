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
class Record_4922 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4922: FirstName is Yvette")
	void FirstNameOfRecord4922() {
		assertEquals("Yvette", customers.get(4921).getFirstName());
	}

	@Test
	@DisplayName("Record 4922: LastName is Winney")
	void LastNameOfRecord4922() {
		assertEquals("Winney", customers.get(4921).getLastName());
	}

	@Test
	@DisplayName("Record 4922: Company is Hause, Thomas L Esq")
	void CompanyOfRecord4922() {
		assertEquals("Hause, Thomas L Esq", customers.get(4921).getCompany());
	}

	@Test
	@DisplayName("Record 4922: Address is 608 2nd Ave S")
	void AddressOfRecord4922() {
		assertEquals("608 2nd Ave S", customers.get(4921).getAddress());
	}

	@Test
	@DisplayName("Record 4922: City is Minneapolis")
	void CityOfRecord4922() {
		assertEquals("Minneapolis", customers.get(4921).getCity());
	}

	@Test
	@DisplayName("Record 4922: County is Hennepin")
	void CountyOfRecord4922() {
		assertEquals("Hennepin", customers.get(4921).getCounty());
	}

	@Test
	@DisplayName("Record 4922: State is MN")
	void StateOfRecord4922() {
		assertEquals("MN", customers.get(4921).getState());
	}

	@Test
	@DisplayName("Record 4922: ZIP is 55402")
	void ZIPOfRecord4922() {
		assertEquals("55402", customers.get(4921).getZIP());
	}

	@Test
	@DisplayName("Record 4922: Phone is 612-339-4543")
	void PhoneOfRecord4922() {
		assertEquals("612-339-4543", customers.get(4921).getPhone());
	}

	@Test
	@DisplayName("Record 4922: Fax is 612-339-2917")
	void FaxOfRecord4922() {
		assertEquals("612-339-2917", customers.get(4921).getFax());
	}

	@Test
	@DisplayName("Record 4922: Email is yvette@winney.com")
	void EmailOfRecord4922() {
		assertEquals("yvette@winney.com", customers.get(4921).getEmail());
	}

	@Test
	@DisplayName("Record 4922: Web is http://www.yvettewinney.com")
	void WebOfRecord4922() {
		assertEquals("http://www.yvettewinney.com", customers.get(4921).getWeb());
	}
}
