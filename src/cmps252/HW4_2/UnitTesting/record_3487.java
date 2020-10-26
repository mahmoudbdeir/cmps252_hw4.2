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

@Tag("17")
class Record_3487 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3487: FirstName is Isabelle")
	void FirstNameOfRecord3487() {
		assertEquals("Isabelle", customers.get(3486).getFirstName());
	}

	@Test
	@DisplayName("Record 3487: LastName is Aguirre")
	void LastNameOfRecord3487() {
		assertEquals("Aguirre", customers.get(3486).getLastName());
	}

	@Test
	@DisplayName("Record 3487: Company is Rottier, Daniel A Esq")
	void CompanyOfRecord3487() {
		assertEquals("Rottier, Daniel A Esq", customers.get(3486).getCompany());
	}

	@Test
	@DisplayName("Record 3487: Address is 608 Jericho Tpke")
	void AddressOfRecord3487() {
		assertEquals("608 Jericho Tpke", customers.get(3486).getAddress());
	}

	@Test
	@DisplayName("Record 3487: City is New Hyde Park")
	void CityOfRecord3487() {
		assertEquals("New Hyde Park", customers.get(3486).getCity());
	}

	@Test
	@DisplayName("Record 3487: County is Nassau")
	void CountyOfRecord3487() {
		assertEquals("Nassau", customers.get(3486).getCounty());
	}

	@Test
	@DisplayName("Record 3487: State is NY")
	void StateOfRecord3487() {
		assertEquals("NY", customers.get(3486).getState());
	}

	@Test
	@DisplayName("Record 3487: ZIP is 11040")
	void ZIPOfRecord3487() {
		assertEquals("11040", customers.get(3486).getZIP());
	}

	@Test
	@DisplayName("Record 3487: Phone is 516-328-7724")
	void PhoneOfRecord3487() {
		assertEquals("516-328-7724", customers.get(3486).getPhone());
	}

	@Test
	@DisplayName("Record 3487: Fax is 516-328-8565")
	void FaxOfRecord3487() {
		assertEquals("516-328-8565", customers.get(3486).getFax());
	}

	@Test
	@DisplayName("Record 3487: Email is isabelle@aguirre.com")
	void EmailOfRecord3487() {
		assertEquals("isabelle@aguirre.com", customers.get(3486).getEmail());
	}

	@Test
	@DisplayName("Record 3487: Web is http://www.isabelleaguirre.com")
	void WebOfRecord3487() {
		assertEquals("http://www.isabelleaguirre.com", customers.get(3486).getWeb());
	}
}
