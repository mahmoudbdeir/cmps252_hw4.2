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
class Record_3019 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3019: FirstName is Imelda")
	void FirstNameOfRecord3019() {
		assertEquals("Imelda", customers.get(3018).getFirstName());
	}

	@Test
	@DisplayName("Record 3019: LastName is Schuckert")
	void LastNameOfRecord3019() {
		assertEquals("Schuckert", customers.get(3018).getLastName());
	}

	@Test
	@DisplayName("Record 3019: Company is Phon Etix Computer Supplies")
	void CompanyOfRecord3019() {
		assertEquals("Phon Etix Computer Supplies", customers.get(3018).getCompany());
	}

	@Test
	@DisplayName("Record 3019: Address is 1031 Quarrier St")
	void AddressOfRecord3019() {
		assertEquals("1031 Quarrier St", customers.get(3018).getAddress());
	}

	@Test
	@DisplayName("Record 3019: City is Charleston")
	void CityOfRecord3019() {
		assertEquals("Charleston", customers.get(3018).getCity());
	}

	@Test
	@DisplayName("Record 3019: County is Kanawha")
	void CountyOfRecord3019() {
		assertEquals("Kanawha", customers.get(3018).getCounty());
	}

	@Test
	@DisplayName("Record 3019: State is WV")
	void StateOfRecord3019() {
		assertEquals("WV", customers.get(3018).getState());
	}

	@Test
	@DisplayName("Record 3019: ZIP is 25301")
	void ZIPOfRecord3019() {
		assertEquals("25301", customers.get(3018).getZIP());
	}

	@Test
	@DisplayName("Record 3019: Phone is 304-346-2106")
	void PhoneOfRecord3019() {
		assertEquals("304-346-2106", customers.get(3018).getPhone());
	}

	@Test
	@DisplayName("Record 3019: Fax is 304-346-5112")
	void FaxOfRecord3019() {
		assertEquals("304-346-5112", customers.get(3018).getFax());
	}

	@Test
	@DisplayName("Record 3019: Email is imelda@schuckert.com")
	void EmailOfRecord3019() {
		assertEquals("imelda@schuckert.com", customers.get(3018).getEmail());
	}

	@Test
	@DisplayName("Record 3019: Web is http://www.imeldaschuckert.com")
	void WebOfRecord3019() {
		assertEquals("http://www.imeldaschuckert.com", customers.get(3018).getWeb());
	}
}
