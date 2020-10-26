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

@Tag("30")
class Record_3651 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3651: FirstName is Bud")
	void FirstNameOfRecord3651() {
		assertEquals("Bud", customers.get(3650).getFirstName());
	}

	@Test
	@DisplayName("Record 3651: LastName is Delawyer")
	void LastNameOfRecord3651() {
		assertEquals("Delawyer", customers.get(3650).getLastName());
	}

	@Test
	@DisplayName("Record 3651: Company is Blumenfeld, John A Esq")
	void CompanyOfRecord3651() {
		assertEquals("Blumenfeld, John A Esq", customers.get(3650).getCompany());
	}

	@Test
	@DisplayName("Record 3651: Address is 61 Blanchard St")
	void AddressOfRecord3651() {
		assertEquals("61 Blanchard St", customers.get(3650).getAddress());
	}

	@Test
	@DisplayName("Record 3651: City is Newark")
	void CityOfRecord3651() {
		assertEquals("Newark", customers.get(3650).getCity());
	}

	@Test
	@DisplayName("Record 3651: County is Essex")
	void CountyOfRecord3651() {
		assertEquals("Essex", customers.get(3650).getCounty());
	}

	@Test
	@DisplayName("Record 3651: State is NJ")
	void StateOfRecord3651() {
		assertEquals("NJ", customers.get(3650).getState());
	}

	@Test
	@DisplayName("Record 3651: ZIP is 7105")
	void ZIPOfRecord3651() {
		assertEquals("7105", customers.get(3650).getZIP());
	}

	@Test
	@DisplayName("Record 3651: Phone is 973-690-1441")
	void PhoneOfRecord3651() {
		assertEquals("973-690-1441", customers.get(3650).getPhone());
	}

	@Test
	@DisplayName("Record 3651: Fax is 973-690-9999")
	void FaxOfRecord3651() {
		assertEquals("973-690-9999", customers.get(3650).getFax());
	}

	@Test
	@DisplayName("Record 3651: Email is bud@delawyer.com")
	void EmailOfRecord3651() {
		assertEquals("bud@delawyer.com", customers.get(3650).getEmail());
	}

	@Test
	@DisplayName("Record 3651: Web is http://www.buddelawyer.com")
	void WebOfRecord3651() {
		assertEquals("http://www.buddelawyer.com", customers.get(3650).getWeb());
	}
}
