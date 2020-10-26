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

@Tag("37")
class Record_4525 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4525: FirstName is Elijah")
	void FirstNameOfRecord4525() {
		assertEquals("Elijah", customers.get(4524).getFirstName());
	}

	@Test
	@DisplayName("Record 4525: LastName is Rosemond")
	void LastNameOfRecord4525() {
		assertEquals("Rosemond", customers.get(4524).getLastName());
	}

	@Test
	@DisplayName("Record 4525: Company is Webking, C J Esq")
	void CompanyOfRecord4525() {
		assertEquals("Webking, C J Esq", customers.get(4524).getCompany());
	}

	@Test
	@DisplayName("Record 4525: Address is Ids Ctr")
	void AddressOfRecord4525() {
		assertEquals("Ids Ctr", customers.get(4524).getAddress());
	}

	@Test
	@DisplayName("Record 4525: City is Minneapolis")
	void CityOfRecord4525() {
		assertEquals("Minneapolis", customers.get(4524).getCity());
	}

	@Test
	@DisplayName("Record 4525: County is Hennepin")
	void CountyOfRecord4525() {
		assertEquals("Hennepin", customers.get(4524).getCounty());
	}

	@Test
	@DisplayName("Record 4525: State is MN")
	void StateOfRecord4525() {
		assertEquals("MN", customers.get(4524).getState());
	}

	@Test
	@DisplayName("Record 4525: ZIP is 55402")
	void ZIPOfRecord4525() {
		assertEquals("55402", customers.get(4524).getZIP());
	}

	@Test
	@DisplayName("Record 4525: Phone is 612-339-1997")
	void PhoneOfRecord4525() {
		assertEquals("612-339-1997", customers.get(4524).getPhone());
	}

	@Test
	@DisplayName("Record 4525: Fax is 612-339-9775")
	void FaxOfRecord4525() {
		assertEquals("612-339-9775", customers.get(4524).getFax());
	}

	@Test
	@DisplayName("Record 4525: Email is elijah@rosemond.com")
	void EmailOfRecord4525() {
		assertEquals("elijah@rosemond.com", customers.get(4524).getEmail());
	}

	@Test
	@DisplayName("Record 4525: Web is http://www.elijahrosemond.com")
	void WebOfRecord4525() {
		assertEquals("http://www.elijahrosemond.com", customers.get(4524).getWeb());
	}
}
